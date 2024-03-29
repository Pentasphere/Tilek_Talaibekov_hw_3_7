package com.geeks.tilek_talaibekov_hw_3_7

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.tilek_talaibekov_hw_3_7.databinding.ItemMusicBinding

class MusicAdapter (private val musicList: List<PlaylistModel>,
    var onClick:(position:Int) -> Unit):RecyclerView.Adapter<MusicAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount()= musicList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener {
            val musicName = musicList[position].name
            val intent = Intent(holder.itemView.context,EmptyActivity::class.java)
            intent.putExtra("name", musicName)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class ViewHolder(private val binding:ItemMusicBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(music: PlaylistModel){
            binding.apply {
                music.apply {
                    tvName.text = name
                    tvNumber.text = number
                    tvAuthor.text = singer
                    tvTime.text = time
                }
            }
        }
    }
}