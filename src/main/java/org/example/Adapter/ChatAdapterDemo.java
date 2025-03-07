package org.example.Adapter;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChatService = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(legacyChatService);
        chatAdapter.sendMessage("Hello World");
    }
}
