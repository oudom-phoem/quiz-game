import java.util.*;

public class Data {
    private final List<Map<String, String>> questionData;

    public Data() {
        questionData = new ArrayList<>();

        questionData.add(Map.of("text", "OpenAI's ChatGPT is an AI model designed for natural language processing.", "answer", "true"));
        questionData.add(Map.of("text", "The M2 chip by Apple is the successor to the M1 chip.", "answer", "true"));
        questionData.add(Map.of("text", "The latest version of Wi-Fi is called Wi-Fi 7.", "answer", "true"));
        questionData.add(Map.of("text", "Android 14 is the most recent version of Google's mobile operating system.", "answer", "true"));
        questionData.add(Map.of("text", "Tesla's Cybertruck is already in full production as of 2023.", "answer", "false"));
        questionData.add(Map.of("text", "The term 'Metaverse' was popularized by Facebook (now Meta) as part of its rebranding.", "answer", "true"));
        questionData.add(Map.of("text", "The latest stable version of Python is Python 3.13.", "answer", "false"));
        questionData.add(Map.of("text", "The RTX 5090 graphics card was released in 2024.", "answer", "false"));
        questionData.add(Map.of("text", "GitHub Copilot is an AI tool for code completion.", "answer", "true"));
        questionData.add(Map.of("text", "5G is the fifth generation of mobile network technology.", "answer", "true"));
    }

    public List<Map<String, String>> getQuestionData() {
        return questionData;
    }
}
