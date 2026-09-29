package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UIntDeserializer {
    final Rect AudioAttributesCompatParcelizer;
    protected final RecyclerView.MediaBrowserCompatItemReceiver RemoteActionCompatParcelizer;
    private int read;

    public abstract int AudioAttributesCompatParcelizer();

    public abstract int AudioAttributesCompatParcelizer(View view);

    public abstract int AudioAttributesImplApi21Parcelizer();

    public abstract int AudioAttributesImplApi21Parcelizer(View view);

    public abstract int IconCompatParcelizer();

    public abstract int IconCompatParcelizer(View view);

    public abstract int MediaBrowserCompatItemReceiver();

    public abstract int RemoteActionCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer(View view);

    public abstract int read();

    public abstract int read(View view);

    public abstract void read(int i);

    public abstract int write();

    public abstract int write(View view);

    /* synthetic */ UIntDeserializer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, byte b) {
        this(mediaBrowserCompatItemReceiver);
    }

    private UIntDeserializer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        this.read = Integer.MIN_VALUE;
        this.AudioAttributesCompatParcelizer = new Rect();
        this.RemoteActionCompatParcelizer = mediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.read = MediaBrowserCompatItemReceiver();
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        if (Integer.MIN_VALUE == this.read) {
            return 0;
        }
        return MediaBrowserCompatItemReceiver() - this.read;
    }

    public static UIntDeserializer write(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i) {
        if (i == 0) {
            return IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        if (i == 1) {
            return AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static UIntDeserializer IconCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        return new UIntDeserializer(mediaBrowserCompatItemReceiver) { // from class: o.UIntDeserializer.4
            {
                byte b = 0;
            }

            @Override // kotlin.UIntDeserializer
            public final int RemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.onPrepare() - this.RemoteActionCompatParcelizer.getPaddingRight();
            }

            @Override // kotlin.UIntDeserializer
            public final int write() {
                return this.RemoteActionCompatParcelizer.onPrepare();
            }

            @Override // kotlin.UIntDeserializer
            public final void read(int i) {
                this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(i);
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesImplApi21Parcelizer() {
                return this.RemoteActionCompatParcelizer.getPaddingLeft();
            }

            @Override // kotlin.UIntDeserializer
            public final int RemoteActionCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int write(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int IconCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.MediaMetadataCompat(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int read(View view) {
                this.RemoteActionCompatParcelizer.write(view, this.AudioAttributesCompatParcelizer);
                return this.AudioAttributesCompatParcelizer.right;
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesImplApi21Parcelizer(View view) {
                this.RemoteActionCompatParcelizer.write(view, this.AudioAttributesCompatParcelizer);
                return this.AudioAttributesCompatParcelizer.left;
            }

            @Override // kotlin.UIntDeserializer
            public final int MediaBrowserCompatItemReceiver() {
                return (this.RemoteActionCompatParcelizer.onPrepare() - this.RemoteActionCompatParcelizer.getPaddingLeft()) - this.RemoteActionCompatParcelizer.getPaddingRight();
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.getPaddingRight();
            }

            @Override // kotlin.UIntDeserializer
            public final int read() {
                return this.RemoteActionCompatParcelizer.onSeekTo();
            }

            @Override // kotlin.UIntDeserializer
            public final int IconCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.onFastForward();
            }
        };
    }

    public static UIntDeserializer AudioAttributesCompatParcelizer(RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        return new UIntDeserializer(mediaBrowserCompatItemReceiver) { // from class: o.UIntDeserializer.1
            {
                byte b = 0;
            }

            @Override // kotlin.UIntDeserializer
            public final int RemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.onMediaButtonEvent() - this.RemoteActionCompatParcelizer.getPaddingBottom();
            }

            @Override // kotlin.UIntDeserializer
            public final int write() {
                return this.RemoteActionCompatParcelizer.onMediaButtonEvent();
            }

            @Override // kotlin.UIntDeserializer
            public final void read(int i) {
                this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(i);
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesImplApi21Parcelizer() {
                return this.RemoteActionCompatParcelizer.getPaddingTop();
            }

            @Override // kotlin.UIntDeserializer
            public final int RemoteActionCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int write(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int IconCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesCompatParcelizer(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver2 = this.RemoteActionCompatParcelizer;
                return RecyclerView.MediaBrowserCompatItemReceiver.RatingCompat(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            }

            @Override // kotlin.UIntDeserializer
            public final int read(View view) {
                this.RemoteActionCompatParcelizer.write(view, this.AudioAttributesCompatParcelizer);
                return this.AudioAttributesCompatParcelizer.bottom;
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesImplApi21Parcelizer(View view) {
                this.RemoteActionCompatParcelizer.write(view, this.AudioAttributesCompatParcelizer);
                return this.AudioAttributesCompatParcelizer.top;
            }

            @Override // kotlin.UIntDeserializer
            public final int MediaBrowserCompatItemReceiver() {
                return (this.RemoteActionCompatParcelizer.onMediaButtonEvent() - this.RemoteActionCompatParcelizer.getPaddingTop()) - this.RemoteActionCompatParcelizer.getPaddingBottom();
            }

            @Override // kotlin.UIntDeserializer
            public final int AudioAttributesCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.getPaddingBottom();
            }

            @Override // kotlin.UIntDeserializer
            public final int read() {
                return this.RemoteActionCompatParcelizer.onFastForward();
            }

            @Override // kotlin.UIntDeserializer
            public final int IconCompatParcelizer() {
                return this.RemoteActionCompatParcelizer.onSeekTo();
            }
        };
    }
}
