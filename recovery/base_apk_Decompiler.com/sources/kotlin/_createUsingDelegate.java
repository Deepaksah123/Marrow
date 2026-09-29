package kotlin;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class _createUsingDelegate {
    static final _createUsingDelegate AudioAttributesCompatParcelizer;
    private static final String IconCompatParcelizer;
    static final configureFromIntCreator RemoteActionCompatParcelizer;
    private static final String read;
    static final _createUsingDelegate write;
    private final configureFromIntCreator AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    static {
        configureFromIntCreator configurefromintcreator = configureFromDoubleCreator.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer = configurefromintcreator;
        IconCompatParcelizer = Character.toString((char) 8206);
        read = Character.toString((char) 8207);
        AudioAttributesCompatParcelizer = new _createUsingDelegate(false, 2, configurefromintcreator);
        write = new _createUsingDelegate(true, 2, configurefromintcreator);
    }

    public static final class write {
        private int AudioAttributesCompatParcelizer;
        private configureFromIntCreator IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;

        public write() {
            write(_createUsingDelegate.read(Locale.getDefault()));
        }

        private void write(boolean z) {
            this.RemoteActionCompatParcelizer = z;
            this.IconCompatParcelizer = _createUsingDelegate.RemoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = 2;
        }

        private static _createUsingDelegate IconCompatParcelizer(boolean z) {
            return z ? _createUsingDelegate.write : _createUsingDelegate.AudioAttributesCompatParcelizer;
        }

        public final _createUsingDelegate AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer == 2 && this.IconCompatParcelizer == _createUsingDelegate.RemoteActionCompatParcelizer) {
                return IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
            return new _createUsingDelegate(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
        }
    }

    public static _createUsingDelegate IconCompatParcelizer() {
        return new write().AudioAttributesCompatParcelizer();
    }

    _createUsingDelegate(boolean z, int i, configureFromIntCreator configurefromintcreator) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = configurefromintcreator;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return (this.AudioAttributesImplBaseParcelizer & 2) != 0;
    }

    private String IconCompatParcelizer(CharSequence charSequence, configureFromIntCreator configurefromintcreator) {
        boolean z = configurefromintcreator.read(charSequence, 0, charSequence.length());
        if (!this.MediaBrowserCompatCustomActionResultReceiver && (z || read(charSequence) == 1)) {
            return IconCompatParcelizer;
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return "";
        }
        if (!z || read(charSequence) == -1) {
            return read;
        }
        return "";
    }

    private String write(CharSequence charSequence, configureFromIntCreator configurefromintcreator) {
        boolean z = configurefromintcreator.read(charSequence, 0, charSequence.length());
        if (!this.MediaBrowserCompatCustomActionResultReceiver && (z || IconCompatParcelizer(charSequence) == 1)) {
            return IconCompatParcelizer;
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return "";
        }
        if (!z || IconCompatParcelizer(charSequence) == -1) {
            return read;
        }
        return "";
    }

    private String AudioAttributesCompatParcelizer(String str, configureFromIntCreator configurefromintcreator) {
        if (str == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(str, configurefromintcreator, true).toString();
    }

    private CharSequence RemoteActionCompatParcelizer(CharSequence charSequence, configureFromIntCreator configurefromintcreator, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean z2 = configurefromintcreator.read(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (AudioAttributesCompatParcelizer()) {
            spannableStringBuilder.append((CharSequence) write(charSequence, z2 ? configureFromDoubleCreator.MediaBrowserCompatItemReceiver : configureFromDoubleCreator.AudioAttributesCompatParcelizer));
        }
        if (z2 != this.MediaBrowserCompatCustomActionResultReceiver) {
            spannableStringBuilder.append(z2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        spannableStringBuilder.append((CharSequence) IconCompatParcelizer(charSequence, z2 ? configureFromDoubleCreator.MediaBrowserCompatItemReceiver : configureFromDoubleCreator.AudioAttributesCompatParcelizer));
        return spannableStringBuilder;
    }

    public final String RemoteActionCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(str, this.AudioAttributesImplApi21Parcelizer);
    }

    public final CharSequence AudioAttributesCompatParcelizer(CharSequence charSequence) {
        return RemoteActionCompatParcelizer(charSequence, this.AudioAttributesImplApi21Parcelizer, true);
    }

    static boolean read(Locale locale) {
        return configureFromBooleanCreator.IconCompatParcelizer(locale) == 1;
    }

    private static int read(CharSequence charSequence) {
        return new IconCompatParcelizer(charSequence).AudioAttributesCompatParcelizer();
    }

    private static int IconCompatParcelizer(CharSequence charSequence) {
        return new IconCompatParcelizer(charSequence).read();
    }

    static class IconCompatParcelizer {
        private static final byte[] IconCompatParcelizer = new byte[1792];
        private char AudioAttributesCompatParcelizer;
        private final CharSequence AudioAttributesImplApi26Parcelizer;
        private final int RemoteActionCompatParcelizer;
        private final boolean read = false;
        private int write;

        static {
            for (int i = 0; i < 1792; i++) {
                IconCompatParcelizer[i] = Character.getDirectionality(i);
            }
        }

        IconCompatParcelizer(CharSequence charSequence) {
            this.AudioAttributesImplApi26Parcelizer = charSequence;
            this.RemoteActionCompatParcelizer = charSequence.length();
        }

        final int read() {
            this.write = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.write < this.RemoteActionCompatParcelizer && i == 0) {
                byte bAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
                if (bAudioAttributesImplApi21Parcelizer != 0) {
                    if (bAudioAttributesImplApi21Parcelizer == 1 || bAudioAttributesImplApi21Parcelizer == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bAudioAttributesImplApi21Parcelizer != 9) {
                        switch (bAudioAttributesImplApi21Parcelizer) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.write > 0) {
                switch (MediaBrowserCompatCustomActionResultReceiver()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        final int AudioAttributesCompatParcelizer() {
            this.write = this.RemoteActionCompatParcelizer;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.write > 0) {
                    byte bMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    if (bMediaBrowserCompatCustomActionResultReceiver == 0) {
                        if (i2 == 0) {
                            return -1;
                        }
                        if (i == 0) {
                            break;
                        }
                    } else if (bMediaBrowserCompatCustomActionResultReceiver == 1 || bMediaBrowserCompatCustomActionResultReceiver == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i == 0) {
                            break;
                        }
                    } else if (bMediaBrowserCompatCustomActionResultReceiver != 9) {
                        switch (bMediaBrowserCompatCustomActionResultReceiver) {
                            case 14:
                            case 15:
                                if (i == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
                i = i2;
            }
        }

        private static byte read(char c) {
            return c < 1792 ? IconCompatParcelizer[c] : Character.getDirectionality(c);
        }

        private byte AudioAttributesImplApi21Parcelizer() {
            char cCharAt = this.AudioAttributesImplApi26Parcelizer.charAt(this.write);
            this.AudioAttributesCompatParcelizer = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.AudioAttributesImplApi26Parcelizer, this.write);
                this.write += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.write++;
            byte b = read(this.AudioAttributesCompatParcelizer);
            if (this.read) {
                char c = this.AudioAttributesCompatParcelizer;
                if (c == '<') {
                    return MediaBrowserCompatItemReceiver();
                }
                if (c == '&') {
                    return write();
                }
            }
            return b;
        }

        private byte MediaBrowserCompatCustomActionResultReceiver() {
            char cCharAt = this.AudioAttributesImplApi26Parcelizer.charAt(this.write - 1);
            this.AudioAttributesCompatParcelizer = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.AudioAttributesImplApi26Parcelizer, this.write);
                this.write -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.write--;
            byte b = read(this.AudioAttributesCompatParcelizer);
            if (this.read) {
                char c = this.AudioAttributesCompatParcelizer;
                if (c == '>') {
                    return IconCompatParcelizer();
                }
                if (c == ';') {
                    return RemoteActionCompatParcelizer();
                }
            }
            return b;
        }

        private byte MediaBrowserCompatItemReceiver() {
            char cCharAt;
            int i = this.write;
            while (true) {
                int i2 = this.write;
                if (i2 < this.RemoteActionCompatParcelizer) {
                    CharSequence charSequence = this.AudioAttributesImplApi26Parcelizer;
                    this.write = i2 + 1;
                    char cCharAt2 = charSequence.charAt(i2);
                    this.AudioAttributesCompatParcelizer = cCharAt2;
                    if (cCharAt2 == '>') {
                        return (byte) 12;
                    }
                    if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                        do {
                            int i3 = this.write;
                            if (i3 < this.RemoteActionCompatParcelizer) {
                                CharSequence charSequence2 = this.AudioAttributesImplApi26Parcelizer;
                                this.write = i3 + 1;
                                cCharAt = charSequence2.charAt(i3);
                                this.AudioAttributesCompatParcelizer = cCharAt;
                            }
                        } while (cCharAt != cCharAt2);
                    }
                } else {
                    this.write = i;
                    this.AudioAttributesCompatParcelizer = '<';
                    return (byte) 13;
                }
            }
        }

        private byte IconCompatParcelizer() {
            char cCharAt;
            int i = this.write;
            while (true) {
                int i2 = this.write;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.AudioAttributesImplApi26Parcelizer;
                int i3 = i2 - 1;
                this.write = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.AudioAttributesCompatParcelizer = cCharAt2;
                if (cCharAt2 != '<') {
                    if (cCharAt2 == '>') {
                        break;
                    }
                    if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                        do {
                            int i4 = this.write;
                            if (i4 > 0) {
                                CharSequence charSequence2 = this.AudioAttributesImplApi26Parcelizer;
                                int i5 = i4 - 1;
                                this.write = i5;
                                cCharAt = charSequence2.charAt(i5);
                                this.AudioAttributesCompatParcelizer = cCharAt;
                            }
                        } while (cCharAt != cCharAt2);
                    }
                } else {
                    return (byte) 12;
                }
            }
            this.write = i;
            this.AudioAttributesCompatParcelizer = '>';
            return (byte) 13;
        }

        private byte write() {
            char cCharAt;
            do {
                int i = this.write;
                if (i >= this.RemoteActionCompatParcelizer) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.AudioAttributesImplApi26Parcelizer;
                this.write = i + 1;
                cCharAt = charSequence.charAt(i);
                this.AudioAttributesCompatParcelizer = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte RemoteActionCompatParcelizer() {
            char cCharAt;
            int i = this.write;
            do {
                int i2 = this.write;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.AudioAttributesImplApi26Parcelizer;
                int i3 = i2 - 1;
                this.write = i3;
                cCharAt = charSequence.charAt(i3);
                this.AudioAttributesCompatParcelizer = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.write = i;
            this.AudioAttributesCompatParcelizer = ';';
            return (byte) 13;
        }
    }
}
