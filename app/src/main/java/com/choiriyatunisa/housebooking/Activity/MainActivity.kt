package com.choiriyatunisa.housebooking.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.choiriyatunisa.housebooking.Adapter.ItemsAdapter
import com.choiriyatunisa.housebooking.Model.ItemsDomain
import com.choiriyatunisa.housebooking.R
import com.choiriyatunisa.housebooking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initList()


        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        )
    }

    private fun initList() {
        val items= arrayListOf(
            ItemsDomain(
                "Apartement",
                "Royal Apartement",
                "Bintaro",
                "item_1",
                1500,
                2,
                3,
                350,
                true,
                4.5,
                "Rumah dengan 2 kamar tidur dan 1 kamar mandi ini menawarkan denah ruang terbuka yang sangat luas, yang dilengkapi dengan fitur arsitektur yang mencolok dan sentuhan akhir yang mewah. Dapatkan inspirasi dari garis pandang terbuka yang merangkul alam terbuka, dimahkotai oleh langit-langit berlajur yang menakjubkan.",
                "https://www.traveloka.com/id-id/hotel/detail?spec=02-05-2025.03-05-2025.1.1.HOTEL.9000000337496.Grande%20Valore%20Hotel%20Cikarang.2&contexts=%7B%22inventoryRateKey%22%3A%22anCOSEscNKDGLQu6sxgfKgB%2FLbmP3B30H5przynvKps6qmnoVzjp%2Bpyr7XSKkZeXbYUUsLJ2S%2F6mck%2FqkdkmeBWZNQ99SWIMtTxcZyjOuNV1KgrGzyRGnkY850CbxRfyR9JoBfSuZgAYy9uuhxT28FxrRvR9ew13bT1%2FFNbLYpuIUt0qoKGyi5V%2FxYjlK96BWoDuW9MC2bG9VIo%2F%2ByGlypI3El0U8qhSUJw0fRo%2FnZhRfQbdgQ1of0sqf%2F%2BYhBmoj5t08rJ4RydQKvCI%2By6QNTjElpAI1l3sOb0f7MrPdKgeUFxI0cWT7oz553zWtVvB4QcYiGDQonuBkAmnDXsi0BwS0Y%2BbV%2FGpw2cGAxHzLJZz8t7bF%2FyR0ERjfNGjxUXKmEAQvSMnVoIA9pZMtQ8Zeyq6DjOsLzs4lSxfInhvlG%2FaJg6FLjBI5NAbPIn83z6bQaZvdQ6U3S4Pv8yukGPyCjWo6zgzn1siy3%2FDmoPOKfv%2BmtXVA0ne5FYbOS64NcKKkSEMih0jYi0e4%2Ba1vZSDa%2BdOvMgWGM1sNxUmblPDE0ha4T82IadyJTMuGnLDhm%2FONJGQCx6uptyEbcg9jQL33qs64X78CwN5KZkodAyO1qCPSWqiuxAWMrIqghoBx5N26HDueIFbM%2FKaYQemHw3AhSuTgCRhuBwP8M4OqtrPUJ2Qc9PqMDVNiAVyVMjpEriWDWOl8ZoWXkS9MbOrmMGqHJXL3uhof9bFOU1D1KhHNcrzaPIAh1J02YBkdidUwzmiffeD5rD69Lf1x72wS2X1L0I9lVSJoLApscR95WH4VZ%2BGFUpZcU4GXV2EjYZjhWrIPtpaMUr92BeBPrcTUAOg9f9yXY5mdDumE4dN0q%2FkyphTBHGNt8L2mGp8Rp0rA5kZaZaMeZ3CfF6%2F%2BpmgVUZuYkQeLjpwgGsNHeHKBHQBM4W%2BnjIuNGluvgDXPq9w9TYfww2NJnC5r3BqESkLML5pEPILNJbI%2Bh5wf%2FVvxY5ZmRf1eVxJ9dt4qNULS%2BuFT1rHLOsg%2BtVMwgdLBQwCFoUNCD%2ByMq1lnD57lCIs7L%2BTFa9b8baN%2B%2FCKl2xGFXZXSvpHkaOIN6D84SEQq9XqK5vAIGVz0rpvEv6EWvkkZ4rXXXZETKF%2BWtkTq7WP2xt7dVLXkjYFe7E9Hsd3uMKwzSkUl8jhJDZu8hYK3GOegND4j8E2J%2ByuUietFuQmH0%2FNZgLEFni0xq5HrETcCJ2o6EKSYR%2FOcWCmGlZYZK8ifMANm4gMn4V7McPQ5rWfZ5E0qR454LsuZvudtA9n75RMbtsz44Xto4%2FGgvOrLadrmX0uNG8%3D%22%7D&loginPromo=1&prevSearchId=1830918493816510921"
            ),
            ItemsDomain(
                "House",
                "House with Great View",
                "Kelapa Gading",
                "item_2",
                800,
                1,
                2,
                500,
                false,
                4.9,
                "Rumah dengan 2 kamar tidur dan1 kamar mandi ini menawarkan denah ruang terbuka yang sangat luas, yang dilengkapi dengan fitur arsitektur yang mencolok dan sentuhan akhir yang mewah. Dapatkan inspirasi dari garis pandang terbuka yang merangkul alam terbuka, dimahkotai oleh langit-langit berlajur yang menakjubkan.",
                "https://www.lamudi.co.id/sewa/jakarta/jakarta-timur/disewakan-rumah-bagus-lokasi-strategis-173966052156/"
            ),
            ItemsDomain(
                "Villa",
                "Royal Villa",
                "Tanggerang",
                "item_3",
                999,
                2,
                1,
                400,
                true,
                4.7,
                "Rumah dengan 2 kamar tidur dan 1 kamar mandi ini menawarkan denah ruang terbuka yang sangat luas, yang dilengkapi dengan fitur arsitektur yang mencolok dan sentuhan akhir yang mewah. Dapatkan inspirasi dari garis pandang terbuka yang merangkul alam terbuka, dimahkotai oleh langit-langit berlajur yang menakjubkan",
                "https://www.agoda.com/id-id/the-celecton-cikarang-jababeka_2/hotel/cikarang-id.html?countryId=192&finalPriceView=1&isShowMobileAppPrice=false&cid=1922865&numberOfBedrooms=&familyMode=false&adults=2&children=0&rooms=1&maxRooms=0&checkIn=2025-05-10&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=1&showReviewSubmissionEntry=false&currencyCode=IDR&isFreeOccSearch=false&tag=8f9108cc-116b-4a9a-ae49-7dc6db871384&los=1&searchrequestid=d06e8047-e4ff-43d6-b68f-7a84d84f3661&ds=H8U6Rn%2FxH8FlX6eH"
            ),
            ItemsDomain(
                "House",
                "Beauty House",
                "Kebon Jeruk",
                "item_4",
                1750,
                3,
                2,
                1100,
                true,
                4.3,
                "Rumah dengan 2 kamar tidur dan 1 kamar mandi ini menawarkan denah ruang terbuka yang sangat luas, yang dilengkapi dengan fitur arsitektur yang mencolok dan sentuhan akhir yang mewah. Dapatkan inspirasi dari garis pandang terbuka yang merangkul alam terbuka, dimahkotai oleh langit-langit berlajur yang menakjubkan.",
                "https://www.travelio.com/property/bekasi/unfurnished-2br-house-at-permata-nusa-indah-jayamulya-by-travelio-realty_A96412435?searchType=monthly&checkIn=01-05-2025&checkOut=01-05-2026&guest=1&nights=365&handpicked=&roomName=2%20Bedrooms&roomBreakfast=0"
            )
        )
        binding.recommendView.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recommendView.adapter = ItemsAdapter(items)
        binding.navigationBar.setItemSelected(0, true)
    }

}

