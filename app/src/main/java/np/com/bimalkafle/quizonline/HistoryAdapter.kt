// app/src/main/java/np/com/bimalkafle/quizonline/HistoryAdapter.kt
package np.com.bimalkafle.quizonline

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import np.com.bimalkafle.quizonline.databinding.HistoryItemRecyclerRowBinding

class HistoryAdapter(private val historyList: List<HistoryModel>) :
    RecyclerView.Adapter<HistoryAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: HistoryItemRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: HistoryModel) {
            binding.historyQuizTitle.text = model.quizTitle
            binding.historyScoreText.text = "Pontuação: ${model.scoreText}"
            binding.historyPercentageText.text = "Acertos: ${model.percentage}%"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = HistoryItemRecyclerRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(historyList[position])
        }
}