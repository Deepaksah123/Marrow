package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class parseXyz {
    private final parseMetaDataSampleEntry AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final IconCompatParcelizer read;
    private final int write;

    interface IconCompatParcelizer {
        Iterator<String> AudioAttributesCompatParcelizer(parseXyz parsexyz, CharSequence charSequence);
    }

    private parseXyz(IconCompatParcelizer iconCompatParcelizer) {
        this(iconCompatParcelizer, parseMetaDataSampleEntry.write());
    }

    private parseXyz(IconCompatParcelizer iconCompatParcelizer, parseMetaDataSampleEntry parsemetadatasampleentry) {
        this.read = iconCompatParcelizer;
        this.IconCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = parsemetadatasampleentry;
        this.write = Integer.MAX_VALUE;
    }

    public static parseXyz read(char c) {
        return AudioAttributesCompatParcelizer(parseMetaDataSampleEntry.IconCompatParcelizer(c));
    }

    private static parseXyz AudioAttributesCompatParcelizer(final parseMetaDataSampleEntry parsemetadatasampleentry) {
        return new parseXyz(new IconCompatParcelizer() { // from class: o.parseXyz.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.parseXyz.IconCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(parseXyz parsexyz, CharSequence charSequence) {
                return new AudioAttributesCompatParcelizer(parsexyz, charSequence) { // from class: o.parseXyz.4.4
                    @Override // o.parseXyz.AudioAttributesCompatParcelizer
                    final int IconCompatParcelizer(int i) {
                        return i + 1;
                    }

                    @Override // o.parseXyz.AudioAttributesCompatParcelizer
                    final int RemoteActionCompatParcelizer(int i) {
                        return parsemetadatasampleentry.IconCompatParcelizer(((AudioAttributesCompatParcelizer) this).write, i);
                    }
                };
            }
        });
    }

    private Iterator<String> read(CharSequence charSequence) {
        return this.read.AudioAttributesCompatParcelizer(this, charSequence);
    }

    public final List<String> IconCompatParcelizer(CharSequence charSequence) {
        Iterator<String> it = read(charSequence);
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    static abstract class AudioAttributesCompatParcelizer extends parseHdlr<String> {
        private int AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private parseMetaDataSampleEntry RemoteActionCompatParcelizer;
        private int read = 0;
        final CharSequence write;

        abstract int IconCompatParcelizer(int i);

        abstract int RemoteActionCompatParcelizer(int i);

        protected AudioAttributesCompatParcelizer(parseXyz parsexyz, CharSequence charSequence) {
            this.RemoteActionCompatParcelizer = parsexyz.AudioAttributesCompatParcelizer;
            this.IconCompatParcelizer = parsexyz.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = parsexyz.write;
            this.write = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.parseHdlr
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String read() {
            int iRemoteActionCompatParcelizer;
            int i = this.read;
            while (true) {
                int i2 = this.read;
                if (i2 != -1) {
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                    if (iRemoteActionCompatParcelizer == -1) {
                        iRemoteActionCompatParcelizer = this.write.length();
                        this.read = -1;
                    } else {
                        this.read = IconCompatParcelizer(iRemoteActionCompatParcelizer);
                    }
                    int i3 = this.read;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.read = i4;
                        if (i4 > this.write.length()) {
                            this.read = -1;
                        }
                    } else {
                        while (i < iRemoteActionCompatParcelizer && this.RemoteActionCompatParcelizer.write(this.write.charAt(i))) {
                            i++;
                        }
                        while (iRemoteActionCompatParcelizer > i && this.RemoteActionCompatParcelizer.write(this.write.charAt(iRemoteActionCompatParcelizer - 1))) {
                            iRemoteActionCompatParcelizer--;
                        }
                        if (!this.IconCompatParcelizer || i != iRemoteActionCompatParcelizer) {
                            break;
                        }
                        i = this.read;
                    }
                } else {
                    write();
                    return null;
                }
            }
            int i5 = this.AudioAttributesCompatParcelizer;
            if (i5 == 1) {
                iRemoteActionCompatParcelizer = this.write.length();
                this.read = -1;
                while (iRemoteActionCompatParcelizer > i && this.RemoteActionCompatParcelizer.write(this.write.charAt(iRemoteActionCompatParcelizer - 1))) {
                    iRemoteActionCompatParcelizer--;
                }
            } else {
                this.AudioAttributesCompatParcelizer = i5 - 1;
            }
            return this.write.subSequence(i, iRemoteActionCompatParcelizer).toString();
        }
    }
}
