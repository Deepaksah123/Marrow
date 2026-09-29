package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class newLessonSuggestionInstance {
    private volatile BookReference AudioAttributesCompatParcelizer;
    private volatile boolean read;
    private setVideoAspectRatio write;

    public final BookReference AudioAttributesCompatParcelizer(BookReference bookReference) {
        read(bookReference);
        return this.AudioAttributesCompatParcelizer;
    }

    public final BookReference RemoteActionCompatParcelizer(BookReference bookReference) {
        BookReference bookReference2 = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = bookReference;
        this.write = null;
        this.read = true;
        return bookReference2;
    }

    public final int AudioAttributesCompatParcelizer() {
        if (this.read) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        throw null;
    }

    private void read(BookReference bookReference) {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this) {
                if (this.AudioAttributesCompatParcelizer != null) {
                    return;
                }
                try {
                    this.AudioAttributesCompatParcelizer = bookReference;
                } catch (IOException unused) {
                }
            }
        }
    }
}
