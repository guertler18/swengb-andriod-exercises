package at.fh.swengb.loggingviewsandactivity

import android.os.strictmode.LeakedClosableViolation

class Lesson(
    val id: String,
    val name:String,
    val date:String,
    val topic:String,
    val type: LessonType,
    val lecturers: List<Lecturer>,
    val ratings: MutableList<LessonRating>
) {
    fun ratingAverage(): Double {
        return ratings.map {it.ratingValue}.average()
    }
}