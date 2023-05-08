package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.batman,
                "batman",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),

            Superhero(
                R.drawable.captain,
                "captain",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),

            Superhero(
                R.drawable.hulk,
                "hulk",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            ),

            Superhero(
                R.drawable.spider,
                "spider",
                "lorem ipsum lorem ipsum lorem ipsum lorem ipsum"
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent(this, DetailSuperHeroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }


    }
}