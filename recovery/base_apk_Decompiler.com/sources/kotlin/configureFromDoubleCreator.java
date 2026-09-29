package kotlin;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class configureFromDoubleCreator {
    public static final configureFromIntCreator AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(null, false);
    public static final configureFromIntCreator MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer(null, true);
    public static final configureFromIntCreator RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, false);
    public static final configureFromIntCreator read = new AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, true);
    public static final configureFromIntCreator write = new AudioAttributesCompatParcelizer(read.RemoteActionCompatParcelizer, false);
    public static final configureFromIntCreator IconCompatParcelizer = AudioAttributesImplApi26Parcelizer.write;

    interface IconCompatParcelizer {
        int RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2);
    }

    static int IconCompatParcelizer(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int write(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    static abstract class write implements configureFromIntCreator {
        private final IconCompatParcelizer write;

        protected abstract boolean IconCompatParcelizer();

        write(IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        @Override // kotlin.configureFromIntCreator
        public boolean read(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            if (this.write == null) {
                return IconCompatParcelizer();
            }
            return AudioAttributesCompatParcelizer(charSequence, i, i2);
        }

        private boolean AudioAttributesCompatParcelizer(CharSequence charSequence, int i, int i2) {
            int iRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(charSequence, i, i2);
            if (iRemoteActionCompatParcelizer == 0) {
                return true;
            }
            if (iRemoteActionCompatParcelizer != 1) {
                return IconCompatParcelizer();
            }
            return false;
        }
    }

    static class AudioAttributesCompatParcelizer extends write {
        private final boolean read;

        AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, boolean z) {
            super(iconCompatParcelizer);
            this.read = z;
        }

        @Override // o.configureFromDoubleCreator.write
        protected boolean IconCompatParcelizer() {
            return this.read;
        }
    }

    static class RemoteActionCompatParcelizer implements IconCompatParcelizer {
        static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // o.configureFromDoubleCreator.IconCompatParcelizer
        public int RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2) {
            int iWrite = 2;
            for (int i3 = i; i3 < i2 + i && iWrite == 2; i3++) {
                iWrite = configureFromDoubleCreator.write(Character.getDirectionality(charSequence.charAt(i3)));
            }
            return iWrite;
        }

        private RemoteActionCompatParcelizer() {
        }
    }

    static class read implements IconCompatParcelizer {
        static final read RemoteActionCompatParcelizer = new read(true);
        private final boolean AudioAttributesCompatParcelizer;

        @Override // o.configureFromDoubleCreator.IconCompatParcelizer
        public int RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2) {
            int i3 = i;
            boolean z = false;
            while (i3 < i2 + i) {
                int iIconCompatParcelizer = configureFromDoubleCreator.IconCompatParcelizer(Character.getDirectionality(charSequence.charAt(i3)));
                if (iIconCompatParcelizer != 0) {
                    if (iIconCompatParcelizer != 1) {
                        continue;
                        i3++;
                        z = z;
                    } else if (!this.AudioAttributesCompatParcelizer) {
                        return 1;
                    }
                } else if (this.AudioAttributesCompatParcelizer) {
                    return 0;
                }
                z = true;
                i3++;
                z = z;
            }
            if (z) {
                return this.AudioAttributesCompatParcelizer ? 1 : 0;
            }
            return 2;
        }

        private read(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }
    }

    static class AudioAttributesImplApi26Parcelizer extends write {
        static final AudioAttributesImplApi26Parcelizer write = new AudioAttributesImplApi26Parcelizer();

        AudioAttributesImplApi26Parcelizer() {
            super(null);
        }

        @Override // o.configureFromDoubleCreator.write
        protected boolean IconCompatParcelizer() {
            return configureFromBooleanCreator.IconCompatParcelizer(Locale.getDefault()) == 1;
        }
    }
}
