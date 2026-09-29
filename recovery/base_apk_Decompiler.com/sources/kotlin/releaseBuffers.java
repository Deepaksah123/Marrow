package kotlin;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0004\u001a\u00020\u00068'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u00020\u000f8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\t\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00138&@'X¦\u000e¢\u0006\u0006\"\u0004\b\u0007\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00068'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0007\u0010\nR\u001c\u0010\u0017\u001a\u00020\u00158'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\f\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00188'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u0004\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00068'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u001d\u001a\u00020\u001b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u0010\u0010\u0012R$\u0010\u001c\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010 \"\u0004\b\u0010\u0010!R\u001e\u0010%\u001a\u0004\u0018\u00010\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010#\"\u0004\b\f\u0010$R\u001e\u0010)\u001a\u0004\u0018\u00010&8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010'\"\u0004\b\f\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/releaseBuffers;", "", "Landroid/graphics/Paint;", "Lo/IconCompatParcelizer;", "IconCompatParcelizer", "()Landroid/graphics/Paint;", "", "write", "()F", "RemoteActionCompatParcelizer", "(F)V", "Lo/switchToNext;", "AudioAttributesCompatParcelizer", "()J", "(J)V", "Lo/createInstance;", "read", "()I", "(I)V", "Lo/ThreadLocalBufferManager;", "MediaMetadataCompat", "Lo/findAutoDetectVisibility;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Lo/findCreatorBinding;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "Lo/TextBuffer;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "()Landroid/graphics/Shader;", "(Landroid/graphics/Shader;)V", "Lo/switchAndReturnNext;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "MediaDescriptionCompat", "Lo/setCurrentLength;", "()Lo/setCurrentLength;", "(Lo/setCurrentLength;)V", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface releaseBuffers {
    long AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(float f);

    void AudioAttributesCompatParcelizer(int i);

    void AudioAttributesCompatParcelizer(long j);

    void AudioAttributesCompatParcelizer(setCurrentLength setcurrentlength);

    void AudioAttributesCompatParcelizer(switchAndReturnNext switchandreturnnext);

    int AudioAttributesImplApi21Parcelizer();

    int AudioAttributesImplApi26Parcelizer();

    setCurrentLength AudioAttributesImplBaseParcelizer();

    Paint IconCompatParcelizer();

    void IconCompatParcelizer(int i);

    int MediaBrowserCompatCustomActionResultReceiver();

    Shader MediaBrowserCompatItemReceiver();

    float MediaBrowserCompatMediaItem();

    float MediaMetadataCompat();

    switchAndReturnNext RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(float f);

    void RemoteActionCompatParcelizer(int i);

    int read();

    void read(int i);

    void read(Shader shader);

    float write();

    void write(float f);

    void write(int i);
}
