package com.example.app_2

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnUpdate: Button = view.findViewById(R.id.btnUpdate)
        btnUpdate.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Info")
                .setMessage("Profile updated successfully!")
                .setPositiveButton("OK") { _, _ ->
                    val intent = Intent(requireActivity(), HomeActivity::class.java)
                    startActivity(intent)
                    requireActivity().finish()
                }
                .show()
        }
        val btnCancel: Button = view.findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
        return view
    }
}
