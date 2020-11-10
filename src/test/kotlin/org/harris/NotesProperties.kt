package org.harris

import io.kotest.matchers.shouldBe
import io.kotest.property.Exhaustive
import io.kotest.property.checkAll
import io.kotest.property.exhaustive.enum
import io.kotest.property.exhaustive.exhaustive
import io.kotest.property.exhaustive.ints
import io.kotest.runner.junit4.StringSpec

val notes = listOf(
    Note.C,
    Note.G,
    Note.D,
    Note.A,
    Note.E,
    Note.B,
    Note.F,
    Note.BFlat,
    Note.EFlat,
    Note.AFlat,
    Note.DFlat,
    Note.GFlat,
    Note.FSharp,
    Note.CSharp,
    Note.GSharp,
    Note.DSharp,
    Note.ASharp
)

class NotesProperties: StringSpec({
    "Sharping and flating a note results in the original note pitch" {
        checkAll(notes.exhaustive()) { note ->
            note.sharp().flat().pitch() shouldBe note.pitch()
        }
    }

    "Flating and sharping a note results in the original note pitch" {
        checkAll(notes.exhaustive()) { note ->
            note.flat().sharp().pitch() shouldBe note.pitch()
        }
    }

    "A sharped note has a higher pitch except B" {
        checkAll(notes.exhaustive()) { note ->
            if (note == Note.B) {
                note.sharp() == Note.C
            } else {
                note.sharp().pitch() > note.pitch()
            }
        }
    }

    "A ftated note has a lower pitch except C" {
        checkAll(notes.exhaustive()) { note ->
            if (note == Note.C) {
                note.flat() == Note.B
            } else {
                note.flat().pitch() < note.pitch()
            }
        }
    }

    "semitones between a note and itself sharp n times is n semitones" {
        checkAll(notes.exhaustive(), Exhaustive.ints(0..12)) { note, distance ->
            var transposed = note

            for (d in 0 until distance) {
                transposed = transposed.sharp()
            }

            if (distance == 12) {
                note.absoluteDistance(transposed) shouldBe 0
            } else {
                note.absoluteDistance(transposed) shouldBe distance
            }
        }
    }

    "semitones between a note and itself flat n times is n semitones" {
        checkAll(notes.exhaustive(), Exhaustive.ints(0..12)) { note, distance ->
            var transposed = note

            for (d in 0 until distance) {
                transposed = transposed.flat()
            }

            if (distance == 12 || distance == 0) {
                note.absoluteDistance(transposed) shouldBe 0
            } else {
                note.absoluteDistance(transposed) shouldBe 12 - distance
            }
        }
    }

    "interval between a note and itself transposed by an interval is the interval with some exceptions" {
        checkAll(notes.exhaustive(), Exhaustive.enum<Interval>()) { note, interval ->
            val to = note.transpose(interval)
            val resultingInterval = note.intervalBetween(to)

            when (note) {
                Note.CSharp, Note.DSharp, Note.FSharp, Note.GSharp, Note.ASharp -> if (interval == Interval.MinorSecond) {
                    resultingInterval shouldBe Interval.AugmentedUnison
                }
                Note.E, Note.B, Note.BFlat, Note.AFlat, Note.DFlat, Note.GFlat, Note.CSharp -> if (interval == Interval.AugmentedSecond) {
                    resultingInterval shouldBe Interval.MinorThird
                }
                Note.EFlat -> if (interval == Interval.DiminishedFifth) {
                    resultingInterval shouldBe Interval.AugmentedFourth
                }
                else -> when (interval) {
                    Interval.Tritone -> resultingInterval shouldBe Interval.DiminishedFifth
                    Interval.DiminishedSeventh -> resultingInterval shouldBe Interval.MajorSixth
                    Interval.PerfectOctave -> resultingInterval shouldBe Interval.Unison
                    Interval.MinorNinth -> resultingInterval shouldBe Interval.MinorSecond
                    Interval.MajorNinth -> resultingInterval shouldBe Interval.MajorSecond
                    Interval.AugmentedNinth -> resultingInterval shouldBe Interval.AugmentedSecond
                    Interval.PerfectEleventh -> resultingInterval shouldBe Interval.PerfectFourth
                    Interval.AugmentedEleventh -> resultingInterval shouldBe Interval.AugmentedFourth
                    Interval.MinorThirteenth -> resultingInterval shouldBe Interval.MinorSixth
                    Interval.MajorThirteenth -> resultingInterval shouldBe Interval.MajorSixth
                    else -> resultingInterval shouldBe interval
                }
            }
        }
    }
})