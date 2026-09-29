package kotlin;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface setDrawSliceText extends Closeable {
    Cursor AudioAttributesCompatParcelizer(setMaxAngle setmaxangle);

    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(String str) throws SQLException;

    boolean AudioAttributesImplApi26Parcelizer();

    boolean AudioAttributesImplBaseParcelizer();

    List<Pair<String, String>> IconCompatParcelizer();

    void IconCompatParcelizer(String str, Object[] objArr) throws SQLException;

    boolean MediaBrowserCompatCustomActionResultReceiver();

    void MediaBrowserCompatItemReceiver();

    setEntryLabelTypeface RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(int i);

    String read();

    int write(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    void write();

    default void RatingCompat() {
        AudioAttributesCompatParcelizer();
    }
}
