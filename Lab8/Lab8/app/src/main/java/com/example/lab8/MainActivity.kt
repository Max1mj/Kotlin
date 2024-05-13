package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalView.layoutManager = LinearLayoutManager(this)
        val itemData = listOf(
            Pair("Bag1", "https://m.media-amazon.com/images/I/61KW1v+yC7L._AC_SX679_.jpg"),
            Pair("Bag2", "https://media.wired.com/photos/5b72139a4177c301e3b9b193/master/pass/Jansport_05.jpg"),
            Pair("Bag3", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cqMaYQB7BXj8YntnvgQM6jv8JTODrrnBq-DXUibHaQ&s"),
            Pair("Bag4", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVOh5zbyA8pIKla33aPM1uXQ7Q4viI-Z5vhoO3esqaaw&s"),
            Pair("Bag5", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgD2BV6BGnHkmpfNecuV4sCrlh35i05g0kfD1Vo6lW_w&s"),
            Pair("Bag6", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8Zwx5f5-4NwMo0uWQtqqw2f70m_a_Jabhk68Hx6bLZw&s"),
            Pair("Bag7", "https://cdna.artstation.com/p/assets/images/images/048/422/754/large/juliao-sodre-sci-fi-cube.jpg?1649980758"),
            Pair("Bag8", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5BGWgbNyC4i3zOSN9EIgKN3BkUfyCbF8tQiC2JkbZZQ&s"),
            Pair("Bag9", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_szIQQFpxWhijOnR9UQ1NDLnwCToW7z8qpnEXJeJ4Rg&s"),
            Pair("Bag10", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFzGja4D_NC0UlvShcswGJIqoSWA_eL1lJsfi5i123CQ&s"),
            Pair("Bag11", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSf2KGMzUWXYoGH3bS37KcKAIpMe7MjTvYpVcZQXKaVw&s"),
            Pair("Bag12", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1PyqCXypNWowAhX8u3usFDBVR2WLFPm7oolrjQqwMYA&s"),
            Pair("Bag13", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPOfgBgDavxlOCHngRGVUvD7pbTKj9uy4SxQSW0z2Mgg&s"),
            Pair("Bag14", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQU3TBQTHvuZP7VkrVYDGWwVQjURtxo6PEVnQqbaj4nUg&s"),
            Pair("Bag15", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJ38FDOz0pi4jWj6_FVlHIPCWVHL0mSuPQm0un7b0Rng&s"),
            Pair("Bag16", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvqI1toC_3WewKeP1wg0DSthdDXSeBkzNPNyRWlPj8GQ&s"),
        )
        val adapter = ItemAdapter(itemData)

        binding.horizontalView.adapter = adapter

        binding.ViewRow.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
            false)
        val secinditemData = listOf(
            Pair("https://m.media-amazon.com/images/I/61KW1v+yC7L._AC_SX679_.jpg",
                "https://m.media-amazon.com/images/I/61KW1v+yC7L._AC_SX679_.jpg"),

            Pair("https://media.wired.com/photos/5b72139a4177c301e3b9b193/master/pass/Jansport_05.jpg",
                "https://media.wired.com/photos/5b72139a4177c301e3b9b193/master/pass/Jansport_05.jpg"),

            Pair("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cqMaYQB7BXj8YntnvgQM6jv8JTODrrnBq-DXUibHaQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cqMaYQB7BXj8YntnvgQM6jv8JTODrrnBq-DXUibHaQ&s"),

            Pair("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvqI1toC_3WewKeP1wg0DSthdDXSeBkzNPNyRWlPj8GQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvqI1toC_3WewKeP1wg0DSthdDXSeBkzNPNyRWlPj8GQ&s"),

            Pair("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cqMaYQB7BXj8YntnvgQM6jv8JTODrrnBq-DXUibHaQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_cqMaYQB7BXj8YntnvgQM6jv8JTODrrnBq-DXUibHaQ&s"),

            Pair("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvqI1toC_3WewKeP1wg0DSthdDXSeBkzNPNyRWlPj8GQ&s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvqI1toC_3WewKeP1wg0DSthdDXSeBkzNPNyRWlPj8GQ&s"),

            )
        val adapter1 = SecondItemAdapter(secinditemData)
        binding.ViewRow.adapter = adapter1
    }
}