package com.example.webpruena.controller;


import com.example.webpruena.model.Usuario;
import com.example.webpruena.repositorio.Usuariorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class Usuariocontroller {

    @Autowired
    private Usuariorepositorio usuariorepositorio;

    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuariorepositorio.save(usuario);
    }

    @GetMapping("listar")
    public List<Usuario> listarUsuarios() {
        return usuariorepositorio.findAll();
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuariorepositorio.findAll();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuariorepositorio.deleteById(id);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario datosLogin) {
        return usuariorepositorio.findByEmail(datosLogin.getEmail())
                .map(usuario -> {
                    if (usuario.getPassword().equals(datosLogin.getPassword())) {
                        return ResponseEntity.ok(usuario);
                    } else {
                        return ResponseEntity.status(401).body("Contraseña incorrecta");
                    }
                })
                .orElse(ResponseEntity.status(404).body("Usuario no encontrado"));
    }

}
