    package com.example.valyutaapiconnectionsretrofit

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Toast
    import com.example.valyutaapiconnectionsretrofit.databinding.ActivityMainBinding
    import com.example.valyutaapiconnectionsretrofit.models.ApiClient
    import com.example.valyutaapiconnectionsretrofit.models.ApiServis
    import com.example.valyutaapiconnectionsretrofit.models.Valyuta
    import retrofit2.Call
    import retrofit2.Callback
    import retrofit2.Response
    import retrofit2.create

    class MainActivity : AppCompatActivity() {
        private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            ApiClient.getApiServis().getResponse().enqueue(object :Callback<List<Valyuta>>{
                override fun onResponse(
                    call: Call<List<Valyuta>>,
                    response: Response<List<Valyuta>>
                ) {
                    binding.myTextview.text=response.body().toString()
                }

                override fun onFailure(call: Call<List<Valyuta>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Damini ol", Toast.LENGTH_SHORT).show()
                }

            })
        }


    }