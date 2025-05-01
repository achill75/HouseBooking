package com.choiriyatunisa.housebooking.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.choiriyatunisa.housebooking.Model.ItemsDomain
import com.choiriyatunisa.housebooking.R
import com.choiriyatunisa.housebooking.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var property: ItemsDomain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        getBundles()
        setVariable()
    }

    private fun setVariable() {
        binding.backBtn.setOnClickListener { finish() }

        val drawableResourceId = resources.getIdentifier(property.pickPath, "drawable", packageName)
        Glide.with(this@DetailActivity)
            .load(drawableResourceId)
            .into(binding.picDetail)

        binding.titleAddressTxt.text = "${property.title} in ${property.address}"
        binding.typeTxt.text = property.type
        binding.descriptionTxt.text = property.description
        binding.priceTxt.text = "$${property.price}"
        binding.bedTxt.text = "${property.bed} Bedroom"
        binding.bathTxt.text = "${property.bath} Bathroom"
        binding.sizeTxt.text = "${property.size} m2"
        binding.garageTxt.text = if (property.isGarage) "Car Garage" else "no-Car Garage"

        // 👉 Tombol addBtn untuk membuka link Traveloka
        binding.addBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(property.link))
            startActivity(intent)
        }
    }

    private fun getBundles() {
        property = intent.getSerializableExtra("object") as ItemsDomain
    }
}