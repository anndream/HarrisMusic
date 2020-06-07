package org.harris

import org.harris.Interval.*

enum class Scale(private val pattern: List<Interval>) {
    Ionian(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, MajorSixth, MajorSeventh)),
    Dorian(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, PerfectFifth, MajorSixth, MinorSeventh)),
    Phrygian(listOf(Unisson, MinorSecond, MinorThird, PerfectFourth, PerfectFifth, MinorSixth, MinorSeventh)),
    Lydian(listOf(Unisson, MajorSecond, MajorThird, AugmentedFourth, PerfectFifth, MajorSixth, MajorSeventh)),
    Mixolydian(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, MajorSixth, MinorSeventh)),
    Aolian(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, PerfectFifth, MinorSixth, MinorSeventh)),
    Locrian(listOf(Unisson, MinorSecond, MinorThird, PerfectFourth, DiminishedFifth, MinorSixth, MinorSeventh)),
    MajorPentatonic(listOf(Unisson, MajorSecond, MajorThird, PerfectFifth, MajorSixth)),
    MinorPentatonic(listOf(Unisson, MinorThird, PerfectFourth, PerfectFifth, MinorSeventh)),
    Blues(listOf(Unisson, MinorThird, PerfectFourth, DiminishedFifth, PerfectFifth, MinorSeventh)),
    HarmonicMinor(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, PerfectFifth, MinorSixth, MajorSeventh)),
    MelodicMinor(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, PerfectFifth, MajorSixth, MajorSeventh)),
    DorianFlat2(listOf(Unisson, MinorSecond, MinorThird, PerfectFourth, PerfectFifth, MajorSixth, MinorSeventh)),
    NeapolitanMinor(listOf(Unisson, MinorSecond, MinorThird, PerfectFourth, PerfectFifth, MinorSixth, MajorSeventh)),
    LydianAugmented(listOf(Unisson, MajorSecond, MajorThird, AugmentedFourth, AugmentedFifth, MajorSixth, MajorSeventh)),
    LydianDominant(listOf(Unisson, MajorSecond, MajorThird, AugmentedFourth, PerfectFifth, MajorSixth, MinorSeventh)),
    MixolydianFlat6(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, MinorSixth, MinorSeventh)),
    Bebop(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, MajorSixth, MinorSeventh, MajorSeventh)),
    LocrianSharp2(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, DiminishedFifth, MinorSixth, MinorSeventh)),
    AlteredDominant(listOf(Unisson, MinorSecond, AugmentedSecond, MajorThird, DiminishedFifth, AugmentedFifth, MinorSeventh)),
    HalfWholeDiminished(listOf(Unisson, MinorSecond, MinorThird, MajorThird, AugmentedFourth, PerfectFifth, MajorSixth, MinorSeventh)),
    WholeTone(listOf(Unisson, MajorSecond, MajorThird, DiminishedFifth, AugmentedFifth, MinorSeventh)),
    MajorSixthDiminishedScale(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, AugmentedFifth, MajorSixth, MajorSeventh)),
    MinorSixthDiminishedScale(listOf(Unisson, MajorSecond, MinorThird, PerfectFourth, PerfectFifth, AugmentedFifth, MajorSixth, MajorSeventh)),
    DominantDiminishedScale(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, PerfectFifth, AugmentedFifth, MinorSeventh, MajorSeventh)),
    DominantFlat5DiminishedScale(listOf(Unisson, MajorSecond, MajorThird, PerfectFourth, DiminishedFifth, AugmentedFifth, MinorSeventh, MajorSeventh));
}