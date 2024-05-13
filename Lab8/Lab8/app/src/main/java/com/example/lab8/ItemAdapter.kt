package com.example.lab8

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab8.databinding.RecycleViewBinding

class ItemAdapter(private val items: List<Pair<String, String?>>) :
    RecyclerView.Adapter<ItemAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding = RecycleViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val currentItem = items[position]
        holder.bind(currentItem.first, currentItem.second)
    }

    class ItemHolder(private val binding: RecycleViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(itemName: String, imageUrl: String?) {

            Glide.with(binding.root)
                .load(imageUrl)
                .placeholder(binding.imageV.drawable)
                .centerCrop()
                .into(binding.imageV)


            binding.itmtxt.text = itemName

            binding.root.setOnClickListener {
                val context = binding.root.context
                Toast.makeText(context, "Clicked on $itemName", Toast.LENGTH_SHORT).show()
            }
        }
    }
}