package org.harris

import org.harris.Interval.Unisson

enum class ChordPattern(private val patternName: String, private val abbreviation: String, private val pattern: List<Interval>) {
    Major("Major", "Maj", listOf(Unisson)),
    Augmented("Major", "Maj", listOf(Unisson)),
    Major6("Major", "Maj", listOf(Unisson)),
    Major6Add9("Major", "Maj", listOf(Unisson)),
    Major6Flat5Add9("Major", "Maj", listOf(Unisson)),
    Major7("Major", "Maj", listOf(Unisson)),
    Major9("Major", "Maj", listOf(Unisson)),
    Major9Sharp11("Major", "Maj", listOf(Unisson)),
    Major11("Major", "Maj", listOf(Unisson)),
    Major13("Major", "Maj", listOf(Unisson)),
    Major13Sharp11("Major", "Maj", listOf(Unisson)),
    Augmented7("Major", "Maj", listOf(Unisson)),
    Dominant7("Major", "Maj", listOf(Unisson)),
    Dominant7Flat5("Major", "Maj", listOf(Unisson)),
    Dominant7Flat9("Major", "Maj", listOf(Unisson)),
    Dominant7Sharp9("Major", "Maj", listOf(Unisson)),
    Dominant7Flat5Flat9("Major", "Maj", listOf(Unisson)),
    Dominant7Flat5Sharp9("Major", "Maj", listOf(Unisson)),
    Dominant9("Major", "Maj", listOf(Unisson)),
    Dominant11("Major", "Maj", listOf(Unisson)),
    Dominant13("Major", "Maj", listOf(Unisson)),
    Minor("Major", "Maj", listOf(Unisson)),
    Diminished("Major", "Maj", listOf(Unisson)),
    Minor7("Major", "Maj", listOf(Unisson)),
    Minor6("Major", "Maj", listOf(Unisson)),
    Minor6Add9("Major", "Maj", listOf(Unisson)),
    Minor9("Major", "Maj", listOf(Unisson)),
    Diminished7("Major", "Maj", listOf(Unisson)),
    Minor7b5("Major", "Maj", listOf(Unisson)),
    MinorMaj7("Major", "Maj", listOf(Unisson)),
    MinorMaj9("Major", "Maj", listOf(Unisson)),
    Sus2("Major", "Maj", listOf(Unisson)),
    Sus2Diminished("Major", "Maj", listOf(Unisson)),
    Sus2Augmented("Major", "Maj", listOf(Unisson)),
    Sus4("Major", "Maj", listOf(Unisson)),
    Sus4Diminished("Major", "Maj", listOf(Unisson)),
    Sus4Augmented("Major", "Maj", listOf(Unisson));
}