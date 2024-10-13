package org.justmeandcode.otp_generator;

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class CopyPassword {

    public static void copy(String otpCode){
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(otpCode);
        clipboard.setContent(content);

    }
}
