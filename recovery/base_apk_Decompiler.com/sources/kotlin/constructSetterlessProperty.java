package kotlin;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0014\u0010\u000e\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#"}, d2 = {"Lo/constructSetterlessProperty;", "", "", "p0", "", "p1", "p2", "Ljava/util/Locale;", "p3", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "MediaBrowserCompatItemReceiver", "(I)I", "MediaBrowserCompatCustomActionResultReceiver", "write", "read", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "(I)Z", "AudioAttributesImplApi26Parcelizer", "(IZ)I", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "", "AudioAttributesImplApi21Parcelizer", "(I)V", "MediaDescriptionCompat", "RatingCompat", "Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class constructSetterlessProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final BreakIterator write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final CharSequence RemoteActionCompatParcelizer;
    private final int read;

    public constructSetterlessProperty(CharSequence charSequence, int i, int i2, Locale locale) {
        this.RemoteActionCompatParcelizer = charSequence;
        if (i < 0 || i > charSequence.length()) {
            withStackTrace.read("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            withStackTrace.read("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.write = wordInstance;
        this.AudioAttributesCompatParcelizer = Math.max(0, i - 50);
        this.read = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new addBackReferenceProperty(charSequence, i, i2));
    }

    public final int MediaBrowserCompatItemReceiver(int p0) {
        AudioAttributesImplApi21Parcelizer(p0);
        int iFollowing = this.write.following(p0);
        return (MediaBrowserCompatSearchResultReceiver(iFollowing + (-1)) && MediaBrowserCompatSearchResultReceiver(iFollowing) && !RatingCompat(iFollowing)) ? MediaBrowserCompatItemReceiver(iFollowing) : iFollowing;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int p0) {
        AudioAttributesImplApi21Parcelizer(p0);
        int iPreceding = this.write.preceding(p0);
        return (MediaBrowserCompatSearchResultReceiver(iPreceding) && AudioAttributesImplBaseParcelizer(iPreceding) && !RatingCompat(iPreceding)) ? MediaBrowserCompatCustomActionResultReceiver(iPreceding) : iPreceding;
    }

    public final int write(int p0) {
        return read(p0, true);
    }

    public final int read(int p0) {
        return IconCompatParcelizer(p0, true);
    }

    public final int IconCompatParcelizer(int p0) {
        AudioAttributesImplApi21Parcelizer(p0);
        while (p0 != -1 && !MediaMetadataCompat(p0)) {
            p0 = MediaBrowserCompatCustomActionResultReceiver(p0);
        }
        return p0;
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        AudioAttributesImplApi21Parcelizer(p0);
        while (p0 != -1 && !MediaBrowserCompatMediaItem(p0)) {
            p0 = MediaBrowserCompatItemReceiver(p0);
        }
        return p0;
    }

    public final boolean RemoteActionCompatParcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 > this.read || i + 1 > p0) {
            return false;
        }
        return INSTANCE.IconCompatParcelizer(Character.codePointBefore(this.RemoteActionCompatParcelizer, p0));
    }

    public final boolean AudioAttributesImplApi26Parcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 >= this.read || i > p0) {
            return false;
        }
        return INSTANCE.IconCompatParcelizer(Character.codePointAt(this.RemoteActionCompatParcelizer, p0));
    }

    private final int read(int p0, boolean p1) {
        AudioAttributesImplApi21Parcelizer(p0);
        if (MediaBrowserCompatSearchResultReceiver(p0)) {
            return (!MediaDescriptionCompat(p0) || (AudioAttributesImplBaseParcelizer(p0) && p1)) ? MediaBrowserCompatCustomActionResultReceiver(p0) : p0;
        }
        if (AudioAttributesImplBaseParcelizer(p0)) {
            return MediaBrowserCompatCustomActionResultReceiver(p0);
        }
        return -1;
    }

    private final int IconCompatParcelizer(int p0, boolean p1) {
        AudioAttributesImplApi21Parcelizer(p0);
        if (AudioAttributesImplBaseParcelizer(p0)) {
            return (!MediaDescriptionCompat(p0) || (MediaBrowserCompatSearchResultReceiver(p0) && p1)) ? MediaBrowserCompatItemReceiver(p0) : p0;
        }
        if (MediaBrowserCompatSearchResultReceiver(p0)) {
            return MediaBrowserCompatItemReceiver(p0);
        }
        return -1;
    }

    private final boolean MediaMetadataCompat(int p0) {
        return AudioAttributesImplApi26Parcelizer(p0) && !RemoteActionCompatParcelizer(p0);
    }

    private final boolean MediaBrowserCompatMediaItem(int p0) {
        return !AudioAttributesImplApi26Parcelizer(p0) && RemoteActionCompatParcelizer(p0);
    }

    private final boolean AudioAttributesImplBaseParcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 > this.read || i + 1 > p0) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.RemoteActionCompatParcelizer, p0))) {
            return true;
        }
        int i2 = p0 - 1;
        if (Character.isSurrogate(this.RemoteActionCompatParcelizer.charAt(i2))) {
            return true;
        }
        if (!_booleanType.read()) {
            return false;
        }
        _booleanType _booleantypeAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer();
        return _booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer() == 1 && _booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, i2) != -1;
    }

    private final boolean MediaBrowserCompatSearchResultReceiver(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 >= this.read || i > p0) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.RemoteActionCompatParcelizer, p0)) || Character.isSurrogate(this.RemoteActionCompatParcelizer.charAt(p0))) {
            return true;
        }
        if (!_booleanType.read()) {
            return false;
        }
        _booleanType _booleantypeAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer();
        return _booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer() == 1 && _booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0) != -1;
    }

    private final void AudioAttributesImplApi21Parcelizer(int p0) {
        int i = this.AudioAttributesCompatParcelizer;
        if (p0 > this.read || i > p0) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(p0);
            sb.append(". Valid range is [");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" , ");
            sb.append(this.read);
            sb.append(']');
            withStackTrace.read(sb.toString());
        }
    }

    private final boolean MediaDescriptionCompat(int p0) {
        AudioAttributesImplApi21Parcelizer(p0);
        if (!this.write.isBoundary(p0)) {
            return false;
        }
        if (MediaBrowserCompatSearchResultReceiver(p0) && MediaBrowserCompatSearchResultReceiver(p0 - 1) && MediaBrowserCompatSearchResultReceiver(p0 + 1)) {
            return false;
        }
        return p0 <= 0 || p0 >= this.RemoteActionCompatParcelizer.length() - 1 || !(RatingCompat(p0) || RatingCompat(p0 + 1));
    }

    private final boolean RatingCompat(int p0) {
        int i = p0 - 1;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Character.UnicodeBlock.of(this.RemoteActionCompatParcelizer.charAt(i)), Character.UnicodeBlock.HIRAGANA) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Character.UnicodeBlock.of(this.RemoteActionCompatParcelizer.charAt(p0)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Character.UnicodeBlock.of(this.RemoteActionCompatParcelizer.charAt(p0)), Character.UnicodeBlock.HIRAGANA) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Character.UnicodeBlock.of(this.RemoteActionCompatParcelizer.charAt(i)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: o.constructSetterlessProperty$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/constructSetterlessProperty$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(I)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean IconCompatParcelizer(int p0) {
            int type = Character.getType(p0);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
