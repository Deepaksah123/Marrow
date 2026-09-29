package kotlin;

import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class getCharset {
    static final Pattern IconCompatParcelizer;
    static final Pattern read;
    private final decodeCommentFrame AudioAttributesCompatParcelizer;
    private final Set<BiConsumer<String, decodeGeobFrame>> AudioAttributesImplApi26Parcelizer = new HashSet();
    private final decodeCommentFrame RemoteActionCompatParcelizer;
    private final Executor write;

    static {
        Charset.forName(CharsetNames.UTF_8);
        read = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        IconCompatParcelizer = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public getCharset(Executor executor, decodeCommentFrame decodecommentframe, decodeCommentFrame decodecommentframe2) {
        this.write = executor;
        this.AudioAttributesCompatParcelizer = decodecommentframe;
        this.RemoteActionCompatParcelizer = decodecommentframe2;
    }

    public final String write(String str) {
        String str2 = read(this.AudioAttributesCompatParcelizer, str);
        if (str2 != null) {
            RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
            return str2;
        }
        String str3 = read(this.RemoteActionCompatParcelizer, str);
        if (str3 != null) {
            return str3;
        }
        IconCompatParcelizer(str, "String");
        return "";
    }

    public final boolean read(String str) {
        String str2 = read(this.AudioAttributesCompatParcelizer, str);
        if (str2 != null) {
            if (read.matcher(str2).matches()) {
                RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
                return true;
            }
            if (IconCompatParcelizer.matcher(str2).matches()) {
                RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
                return false;
            }
        }
        String str3 = read(this.RemoteActionCompatParcelizer, str);
        if (str3 != null) {
            if (read.matcher(str3).matches()) {
                return true;
            }
            if (IconCompatParcelizer.matcher(str3).matches()) {
                return false;
            }
        }
        IconCompatParcelizer(str, "Boolean");
        return false;
    }

    public final long AudioAttributesCompatParcelizer(String str) {
        Long lRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, str);
        if (lRemoteActionCompatParcelizer != null) {
            RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
            return lRemoteActionCompatParcelizer.longValue();
        }
        Long lRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, str);
        if (lRemoteActionCompatParcelizer2 != null) {
            return lRemoteActionCompatParcelizer2.longValue();
        }
        IconCompatParcelizer(str, "Long");
        return 0L;
    }

    private getSubFrameCount RemoteActionCompatParcelizer(String str) {
        String str2 = read(this.AudioAttributesCompatParcelizer, str);
        if (str2 != null) {
            RemoteActionCompatParcelizer(str, AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
            return new Id3DecoderFramePredicate(str2, 2);
        }
        String str3 = read(this.RemoteActionCompatParcelizer, str);
        if (str3 != null) {
            return new Id3DecoderFramePredicate(str3, 1);
        }
        IconCompatParcelizer(str, "FirebaseRemoteConfigValue");
        return new Id3DecoderFramePredicate("", 0);
    }

    public final Map<String, getSubFrameCount> write() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(write(this.AudioAttributesCompatParcelizer));
        hashSet.addAll(write(this.RemoteActionCompatParcelizer));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, RemoteActionCompatParcelizer(str));
        }
        return map;
    }

    public final void IconCompatParcelizer(BiConsumer<String, decodeGeobFrame> biConsumer) {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer.add(biConsumer);
        }
    }

    private void RemoteActionCompatParcelizer(final String str, final decodeGeobFrame decodegeobframe) {
        if (decodegeobframe == null) {
            return;
        }
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            for (final BiConsumer<String, decodeGeobFrame> biConsumer : this.AudioAttributesImplApi26Parcelizer) {
                this.write.execute(new Runnable() { // from class: o.delimiterLength
                    @Override // java.lang.Runnable
                    public final void run() {
                        biConsumer.accept(str, decodegeobframe);
                    }
                });
            }
        }
    }

    private static String read(decodeCommentFrame decodecommentframe, String str) {
        decodeGeobFrame decodegeobframeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(decodecommentframe);
        if (decodegeobframeAudioAttributesCompatParcelizer == null) {
            return null;
        }
        try {
            return decodegeobframeAudioAttributesCompatParcelizer.IconCompatParcelizer().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Long RemoteActionCompatParcelizer(decodeCommentFrame decodecommentframe, String str) {
        decodeGeobFrame decodegeobframeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(decodecommentframe);
        if (decodegeobframeAudioAttributesCompatParcelizer == null) {
            return null;
        }
        try {
            return Long.valueOf(decodegeobframeAudioAttributesCompatParcelizer.IconCompatParcelizer().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> write(decodeCommentFrame decodecommentframe) {
        HashSet hashSet = new HashSet();
        decodeGeobFrame decodegeobframeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(decodecommentframe);
        if (decodegeobframeAudioAttributesCompatParcelizer != null) {
            Iterator<String> itKeys = decodegeobframeAudioAttributesCompatParcelizer.IconCompatParcelizer().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    private static decodeGeobFrame AudioAttributesCompatParcelizer(decodeCommentFrame decodecommentframe) {
        return decodecommentframe.AudioAttributesCompatParcelizer();
    }

    private static void IconCompatParcelizer(String str, String str2) {
        new Object[]{str2, str};
    }
}
