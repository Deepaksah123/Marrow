package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parseMetaDataSampleEntry implements parseTraks<Character> {
    public abstract boolean write(char c);

    public static parseMetaDataSampleEntry write() {
        return write.read;
    }

    public static parseMetaDataSampleEntry AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer.write;
    }

    public static parseMetaDataSampleEntry IconCompatParcelizer(char c) {
        return new AudioAttributesCompatParcelizer(c);
    }

    protected parseMetaDataSampleEntry() {
    }

    public boolean read(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!write(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public int IconCompatParcelizer(CharSequence charSequence, int i) {
        int length = charSequence.length();
        parseStsd.read(i, length);
        while (i < length) {
            if (write(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // kotlin.parseTraks
    @Deprecated
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final boolean apply(Character ch) {
        return write(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String AudioAttributesCompatParcelizer(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    static abstract class read extends parseMetaDataSampleEntry {
        read() {
        }

        @Override // kotlin.parseMetaDataSampleEntry, kotlin.parseTraks
        @Deprecated
        public /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }
    }

    static abstract class RemoteActionCompatParcelizer extends read {
        private final String write;

        RemoteActionCompatParcelizer(String str) {
            this.write = (String) parseStsd.IconCompatParcelizer(str);
        }

        @Override // kotlin.parseMetaDataSampleEntry
        public final String toString() {
            return this.write;
        }
    }

    static final class write extends RemoteActionCompatParcelizer {
        static final parseMetaDataSampleEntry read = new write();

        @Override // kotlin.parseMetaDataSampleEntry
        public final boolean write(char c) {
            return false;
        }

        private write() {
            super("CharMatcher.none()");
        }

        @Override // kotlin.parseMetaDataSampleEntry
        public final int IconCompatParcelizer(CharSequence charSequence, int i) {
            parseStsd.read(i, charSequence.length());
            return -1;
        }

        @Override // kotlin.parseMetaDataSampleEntry
        public final boolean read(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    static final class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        static final parseMetaDataSampleEntry write = new IconCompatParcelizer();

        @Override // kotlin.parseMetaDataSampleEntry
        public final boolean write(char c) {
            return c <= 127;
        }

        IconCompatParcelizer() {
            super("CharMatcher.ascii()");
        }
    }

    static final class AudioAttributesCompatParcelizer extends read {
        private final char RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(char c) {
            this.RemoteActionCompatParcelizer = c;
        }

        @Override // kotlin.parseMetaDataSampleEntry
        public final boolean write(char c) {
            return c == this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.parseMetaDataSampleEntry
        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            sb.append(parseMetaDataSampleEntry.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer));
            sb.append("')");
            return sb.toString();
        }
    }
}
