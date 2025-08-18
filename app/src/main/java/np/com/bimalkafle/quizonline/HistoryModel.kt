// app/src/main/java/np/com/bimalkafle/quizonline/HistoryModel.kt
package np.com.bimalkafle.quizonline

import com.google.firebase.Timestamp

data class HistoryModel(
    val quizTitle: String = "",
    val scoreText: String = "",
    val percentage: Int = 0,
    val timestamp: Timestamp = Timestamp.now()
) {
    // Construtor vazio necessário para o Firebase
    constructor() : this("", "", 0, Timestamp.now())
}