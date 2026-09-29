package com.marrow.ui.views;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;
import kotlin.buildDownloadCompletedNotification;

/* JADX INFO: loaded from: classes5.dex */
public class BookReferenceView extends LinearLayout {
    private ImageView AudioAttributesCompatParcelizer;
    private TextView read;

    public BookReferenceView(Context context) {
        super(context);
        AudioAttributesCompatParcelizer(context);
    }

    public BookReferenceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AudioAttributesCompatParcelizer(context);
    }

    public BookReferenceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AudioAttributesCompatParcelizer(context);
    }

    private void AudioAttributesCompatParcelizer(Context context) {
        LayoutInflater.from(context).inflate(R.layout.custom_view_references, (ViewGroup) this, true);
        this.AudioAttributesCompatParcelizer = (ImageView) findViewById(R.id.book_preview_image_view);
        this.read = (TextView) findViewById(R.id.textView);
    }

    public void setBookTitle(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" <i>");
        sb.append(str2);
        sb.append("</i>");
        this.read.setText(Html.fromHtml(sb.toString(), 0));
    }

    public void setBookImage(String str) {
        this.AudioAttributesCompatParcelizer.setBackgroundResource(android.R.color.transparent);
        buildDownloadCompletedNotification.write(this.AudioAttributesCompatParcelizer, str);
    }
}
