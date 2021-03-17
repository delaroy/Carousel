package com.delaroystudios.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.delaroystudios.carousel.adapter.DataAdapter
import com.delaroystudios.carousel.model.DataModel
import com.jackandphantom.carouselrecyclerview.CarouselLayoutManager
import com.jackandphantom.carouselrecyclerview.CarouselRecyclerview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carouselRecyclerview = findViewById<CarouselRecyclerview>(R.id.recycler)

        val list = ArrayList<DataModel>()
        list.add(DataModel(R.drawable.ad_astra, "Adastra"))
        list.add(DataModel(R.drawable.beach_bum, "Beach Bum"))
        list.add(DataModel(R.drawable.dark_phoenix, "Dark Phoenix"))
        list.add(DataModel(R.drawable.glass, "Glass"))
        list.add(DataModel(R.drawable.her_smell_1, "Her Smell"))
        list.add(DataModel(R.drawable.midsommar, "Midsommar"))
        list.add(DataModel(R.drawable.once_upon, "Once Upon"))
        list.add(DataModel(R.drawable.parasite, "Parasite"))
        list.add(DataModel(R.drawable.portrait, "Portrait"))
        list.add(DataModel(R.drawable.uncut_gems, "Uncut Gems"))


        val adapter = DataAdapter(list)

        carouselRecyclerview.adapter = adapter
        carouselRecyclerview.set3DItem(true)
        carouselRecyclerview.setAlpha(true)
        val carouselLayoutManager = carouselRecyclerview.getCarouselLayoutManager()
        val currentlyCenterPosition = carouselRecyclerview.getSelectedPosition()

        carouselRecyclerview.setItemSelectListener(object : CarouselLayoutManager.OnSelected {
            override fun onItemSelected(position: Int) {
                //Cente item
                Toast.makeText(this@MainActivity, list[position].text, Toast.LENGTH_LONG).show()

            }
        })
    }
}