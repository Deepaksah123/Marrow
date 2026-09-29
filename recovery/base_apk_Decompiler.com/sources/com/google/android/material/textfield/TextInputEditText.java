package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.calculateNextSearchBytePosition;
import kotlin.readFrames;
import kotlin.readFullyQuietly;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect IconCompatParcelizer;
    private boolean write;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, 0), attributeSet, i);
        this.IconCompatParcelizer = new Rect();
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.TextInputEditText, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayWrite.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (textInputLayoutAudioAttributesCompatParcelizer != null && textInputLayoutAudioAttributesCompatParcelizer.RatingCompat() && super.getHint() == null && readFullyQuietly.AudioAttributesCompatParcelizer()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (textInputLayoutAudioAttributesCompatParcelizer != null && textInputLayoutAudioAttributesCompatParcelizer.RatingCompat()) {
            return textInputLayoutAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        return super.getHint();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = IconCompatParcelizer();
        }
        return inputConnectionOnCreateInputConnection;
    }

    private TextInputLayout AudioAttributesCompatParcelizer() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private CharSequence IconCompatParcelizer() {
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (textInputLayoutAudioAttributesCompatParcelizer != null) {
            return textInputLayoutAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.write = z;
    }

    private boolean AudioAttributesCompatParcelizer(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.write;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (!AudioAttributesCompatParcelizer(textInputLayoutAudioAttributesCompatParcelizer) || rect == null) {
            return;
        }
        textInputLayoutAudioAttributesCompatParcelizer.getFocusedRect(this.IconCompatParcelizer);
        rect.bottom = this.IconCompatParcelizer.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (AudioAttributesCompatParcelizer(textInputLayoutAudioAttributesCompatParcelizer)) {
            boolean globalVisibleRect = textInputLayoutAudioAttributesCompatParcelizer.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayoutAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (AudioAttributesCompatParcelizer(textInputLayoutAudioAttributesCompatParcelizer) && rect != null) {
            this.IconCompatParcelizer.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayoutAudioAttributesCompatParcelizer.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.IconCompatParcelizer);
        }
        return super.requestRectangleOnScreen(rect);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AudioAttributesCompatParcelizer();
    }
}
