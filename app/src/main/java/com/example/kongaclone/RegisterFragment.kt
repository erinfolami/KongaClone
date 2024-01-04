package com.example.kongaclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.kongaclone.auth.fragments.LoginFragmentDirections
import com.example.kongaclone.databinding.FragmentLoginBinding
import com.example.kongaclone.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginTv =  binding.loginTv

        loginTv.setOnClickListener {
            val action =
                RegisterFragmentDirections
                    .actionRegisterFragmentToLoginFragment()
            view.findNavController().navigate(action)
        }
    }
}