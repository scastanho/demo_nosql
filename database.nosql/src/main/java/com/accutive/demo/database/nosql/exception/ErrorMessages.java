package com.accutive.demo.database.nosql.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessages {

    // Mapeamento para mensagens por idioma
    private static final Map<String, Map<String, String>> messages = new HashMap<>();

    // Inicialização estática das mensagens de erro
    static {
        // Mensagens em inglês
        Map<String, String> enMessages = new HashMap<>();
        enMessages.put("USER_NOT_FOUND", "User not found with ID: ");
        enMessages.put("REPOSITORY_NOT_INJECTED", "Repository is not injected.");
        enMessages.put("INVALID_REQUEST", "Invalid request.");
        enMessages.put("UNAUTHORIZED", "Unauthorized access.");
        enMessages.put("FORBIDDEN", "Access is forbidden.");
        enMessages.put("INTERNAL_SERVER_ERROR", "Internal server error.");
        messages.put("en", enMessages);

        // Mensagens em português
        Map<String, String> ptMessages = new HashMap<>();
        ptMessages.put("USER_NOT_FOUND", "Usuário não encontrado com ID: ");
        ptMessages.put("REPOSITORY_NOT_INJECTED", "Repositório não foi injetado.");
        ptMessages.put("INVALID_REQUEST", "Requisição inválida.");
        ptMessages.put("UNAUTHORIZED", "Acesso não autorizado.");
        ptMessages.put("FORBIDDEN", "Acesso proibido.");
        ptMessages.put("INTERNAL_SERVER_ERROR", "Erro interno do servidor.");
        messages.put("pt", ptMessages);
    }

    // Recupera uma mensagem de erro no idioma especificado
    public static String getMessage(String key, String language) {
        Map<String, String> langMessages = messages.getOrDefault(language, messages.get("en"));
        return langMessages.getOrDefault(key, "Unknown error.");
    }
}
