package com.example.lab8
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab8.databinding.RecycleOtherBinding

class SecondItemAdapter(private val photos: List<Pair<String?, String?>>):
        RecyclerView.Adapter<SecondItemAdapter.PhotoHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotoHolder {
        val binding = RecycleOtherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoHolder(binding)
    }

    override fun getItemCount(): Int {
        return photos.size
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val currentPhoto = photos[position]
        holder.bind(currentPhoto.first, currentPhoto.second)
    }

    class PhotoHolder(private val binding: RecycleOtherBinding):
            RecyclerView.ViewHolder(binding.root){

                fun bind(Fphoto: String?, Sphoto: String?){
                    Glide.with(binding.root)
                        .load(Fphoto)
                        .placeholder(binding.imageH.drawable)
                        .centerCrop()
                        .into(binding.imageH)

                    Glide.with(binding.root)
                        .load(Sphoto)
                        .placeholder(binding.imageH1.drawable)
                        .centerCrop()
                        .into(binding.imageH1)
                }
            }
}