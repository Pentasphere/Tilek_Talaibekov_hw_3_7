package com.geeks.tilek_talaibekov_hw_3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.tilek_talaibekov_hw_3_7.databinding.FragmentPlaylistBinding

class PlaylistFragment : Fragment() {

    private lateinit var binding: FragmentPlaylistBinding

    private val musicList = arrayListOf(
        PlaylistModel("1","Not afraid","Eminem","4:10"),
        PlaylistModel("2","How come","Eminem","4:09"),
        PlaylistModel("3","Bring me to life","Evanescence","3:57"),
        PlaylistModel("4","Fastlane","Bad meets evil","4:09"),
        PlaylistModel("5","Taking my ball","Eminem","6:14"),
        PlaylistModel("6","When I'm gone","Eminem","4:40"),
        PlaylistModel("7","Lose yourself","Eminem","5:19"),
        PlaylistModel("8","Patiently waiting","50 cent","4:48"),
        PlaylistModel("9","Beautiful","Eminem","6:31"),
        PlaylistModel("10","Already","DMX","3:23"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }

    private fun onClick(pos: Int) {
        val intent = Intent(activity, EmptyActivity::class.java)
        intent.putExtra("key2", pos)
        startActivity(intent)
    }
}