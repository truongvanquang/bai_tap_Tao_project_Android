package com.example.baitap_viewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
// Sửa đoạn com.example.baitap_viewbinding bên dưới thành tên package thực tế của bạn nếu cần
import com.example.baitap_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Khai báo biến binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo ViewBinding (Thay thế hoàn toàn findViewById)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bắt sự kiện nút bấm trực tiếp qua binding
        binding.btnSubmit.setOnClickListener {
            val inputText = binding.edtInput.text.toString().trim()

            if (inputText.isNotEmpty()) {
                // Đẩy dữ liệu lên TextView qua binding
                binding.tvResult.text = "Bạn vừa nhập: $inputText"
            } else {
                Toast.makeText(this, "Vui lòng nhập dữ liệu!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}