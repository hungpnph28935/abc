package hungpnph28935.fptpolytechnic.viewbingdinhdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import hungpnph28935.fptpolytechnic.viewbingdinhdemo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding.tv2.text="ko liên quan đến layout 1"
        binding.btn2.setOnClickListener{
            Snackbar.make(it,"snackbar",Snackbar.LENGTH_LONG).setAction("hủy"){""
                Toast.makeText(this@MainActivity2,"abcaa",Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}