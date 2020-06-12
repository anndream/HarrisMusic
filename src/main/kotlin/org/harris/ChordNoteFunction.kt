package org.harris

enum class ChordNoteFunction {
    Root,
    Third,
    Fifth,
    Sixth,
    Seventh,
    Ninth,
    Eleventh,
    Thirteenth;

    companion object {
        internal fun functionForInterval(interval: Interval): ChordNoteFunction {
            return when (interval) {
                Interval.Unison -> Root
                Interval.MajorThird,
                Interval.MinorThird,
                Interval.MajorSecond,
                Interval.MinorSecond,
                Interval.PerfectFourth,
                Interval.AugmentedFourth -> Third
                Interval.PerfectFifth,
                Interval.DiminishedFifth,
                Interval.AugmentedFifth -> Fifth
                Interval.MinorSixth,
                Interval.MajorSixth -> Sixth
                Interval.MajorSeventh,
                Interval.MinorSeventh,
                Interval.DiminishedSeventh -> Seventh
                Interval.MajorNinth,
                Interval.MinorNinth,
                Interval.AugmentedNinth -> Ninth
                Interval.PerfectEleventh,
                Interval.AugmentedEleventh -> Eleventh
                Interval.MajorThirteenth -> Thirteenth
                else -> Root
            }
        }
    }
}