import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Aluno(
    val nome: String,
    val n1: Float,
    val n2: Float,
    val frequencia: Int
): Parcelable