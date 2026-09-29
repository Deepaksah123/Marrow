package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.deserializexfHcF5w;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class RegexDeserializer implements deserializexfHcF5w.read {
    final read AudioAttributesCompatParcelizer;
    private Runnable AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    final ArrayList<IconCompatParcelizer> IconCompatParcelizer;
    private rewrapCtorProblem.IconCompatParcelizer<IconCompatParcelizer> MediaBrowserCompatItemReceiver;
    final deserializexfHcF5w RemoteActionCompatParcelizer;
    final boolean read;
    final ArrayList<IconCompatParcelizer> write;

    public interface read {
        void AudioAttributesCompatParcelizer(int i, int i2);

        RecyclerView.onMediaButtonEvent RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(int i, int i2);

        void RemoteActionCompatParcelizer(int i, int i2, Object obj);

        void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer);

        void read(int i, int i2);

        void read(IconCompatParcelizer iconCompatParcelizer);

        void write(int i, int i2);
    }

    public RegexDeserializer(read readVar) {
        this(readVar, (byte) 0);
    }

    private RegexDeserializer(read readVar, byte b) {
        this.MediaBrowserCompatItemReceiver = new rewrapCtorProblem.AudioAttributesCompatParcelizer(30);
        this.write = new ArrayList<>();
        this.IconCompatParcelizer = new ArrayList<>();
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesCompatParcelizer = readVar;
        this.read = false;
        this.RemoteActionCompatParcelizer = new deserializexfHcF5w(this);
    }

    public final void MediaBrowserCompatItemReceiver() {
        RemoteActionCompatParcelizer(this.write);
        RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.write);
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.write.get(i);
            int i2 = iconCompatParcelizer.read;
            if (i2 == 1) {
                write(iconCompatParcelizer);
            } else if (i2 == 2) {
                RemoteActionCompatParcelizer(iconCompatParcelizer);
            } else if (i2 == 4) {
                read(iconCompatParcelizer);
            } else if (i2 == 8) {
                IconCompatParcelizer(iconCompatParcelizer);
            }
        }
        this.write.clear();
    }

    public final void IconCompatParcelizer() {
        int size = this.IconCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.get(i));
        }
        RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesImplApi26Parcelizer(iconCompatParcelizer);
    }

    private void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        boolean z;
        byte b;
        int i = iconCompatParcelizer.RemoteActionCompatParcelizer;
        int i2 = iconCompatParcelizer.RemoteActionCompatParcelizer + iconCompatParcelizer.write;
        int i3 = iconCompatParcelizer.RemoteActionCompatParcelizer;
        byte b2 = -1;
        int i4 = 0;
        while (i3 < i2) {
            if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i3) != null || RemoteActionCompatParcelizer(i3)) {
                if (b2 == 0) {
                    MediaBrowserCompatCustomActionResultReceiver(AudioAttributesCompatParcelizer(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 1;
            } else {
                if (b2 == 1) {
                    AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b2 = b;
        }
        if (i4 != iconCompatParcelizer.write) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer);
            iconCompatParcelizer = AudioAttributesCompatParcelizer(2, i, i4, null);
        }
        if (b2 == 0) {
            MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer);
        } else {
            AudioAttributesImplApi26Parcelizer(iconCompatParcelizer);
        }
    }

    private void read(IconCompatParcelizer iconCompatParcelizer) {
        int i = iconCompatParcelizer.RemoteActionCompatParcelizer;
        int i2 = iconCompatParcelizer.RemoteActionCompatParcelizer;
        int i3 = iconCompatParcelizer.write;
        byte b = -1;
        int i4 = 0;
        for (int i5 = iconCompatParcelizer.RemoteActionCompatParcelizer; i5 < i2 + i3; i5++) {
            if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i5) != null || RemoteActionCompatParcelizer(i5)) {
                if (b == 0) {
                    MediaBrowserCompatCustomActionResultReceiver(AudioAttributesCompatParcelizer(4, i, i4, iconCompatParcelizer.AudioAttributesCompatParcelizer));
                    i = i5;
                    i4 = 0;
                }
                b = 1;
            } else {
                if (b == 1) {
                    AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer(4, i, i4, iconCompatParcelizer.AudioAttributesCompatParcelizer));
                    i = i5;
                    i4 = 0;
                }
                b = 0;
            }
            i4++;
        }
        if (i4 != iconCompatParcelizer.write) {
            Object obj = iconCompatParcelizer.AudioAttributesCompatParcelizer;
            AudioAttributesCompatParcelizer(iconCompatParcelizer);
            iconCompatParcelizer = AudioAttributesCompatParcelizer(4, i, i4, obj);
        }
        if (b == 0) {
            MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer);
        } else {
            AudioAttributesImplApi26Parcelizer(iconCompatParcelizer);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer) {
        int i;
        if (iconCompatParcelizer.read == 1 || iconCompatParcelizer.read == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i2 = read(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.read);
        int i3 = iconCompatParcelizer.RemoteActionCompatParcelizer;
        int i4 = iconCompatParcelizer.read;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(iconCompatParcelizer)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < iconCompatParcelizer.write; i6++) {
            int i7 = read(iconCompatParcelizer.RemoteActionCompatParcelizer + (i * i6), iconCompatParcelizer.read);
            int i8 = iconCompatParcelizer.read;
            if (i8 == 2 ? i7 != i2 : !(i8 == 4 && i7 == i2 + 1)) {
                IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iconCompatParcelizer.read, i2, i5, iconCompatParcelizer.AudioAttributesCompatParcelizer);
                RemoteActionCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer, i3);
                AudioAttributesCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer);
                if (iconCompatParcelizer.read == 4) {
                    i3 += i5;
                }
                i5 = 1;
                i2 = i7;
            } else {
                i5++;
            }
        }
        Object obj = iconCompatParcelizer.AudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer(iconCompatParcelizer);
        if (i5 > 0) {
            IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(iconCompatParcelizer.read, i2, i5, obj);
            RemoteActionCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer2, i3);
            AudioAttributesCompatParcelizer(iconCompatParcelizerAudioAttributesCompatParcelizer2);
        }
    }

    private void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, int i) {
        this.AudioAttributesCompatParcelizer.read(iconCompatParcelizer);
        int i2 = iconCompatParcelizer.read;
        if (i2 == 2) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, iconCompatParcelizer.write);
        } else {
            if (i2 == 4) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, iconCompatParcelizer.write, iconCompatParcelizer.AudioAttributesCompatParcelizer);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int read(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.IconCompatParcelizer.size() - 1; size >= 0; size--) {
            IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer.get(size);
            if (iconCompatParcelizer.read == 8) {
                if (iconCompatParcelizer.RemoteActionCompatParcelizer < iconCompatParcelizer.write) {
                    i3 = iconCompatParcelizer.RemoteActionCompatParcelizer;
                    i4 = iconCompatParcelizer.write;
                } else {
                    i3 = iconCompatParcelizer.write;
                    i4 = iconCompatParcelizer.RemoteActionCompatParcelizer;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == iconCompatParcelizer.RemoteActionCompatParcelizer) {
                        if (i2 == 1) {
                            iconCompatParcelizer.write++;
                        } else if (i2 == 2) {
                            iconCompatParcelizer.write--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            iconCompatParcelizer.RemoteActionCompatParcelizer++;
                        } else if (i2 == 2) {
                            iconCompatParcelizer.RemoteActionCompatParcelizer--;
                        }
                        i--;
                    }
                } else if (i < iconCompatParcelizer.RemoteActionCompatParcelizer) {
                    if (i2 == 1) {
                        iconCompatParcelizer.RemoteActionCompatParcelizer++;
                        iconCompatParcelizer.write++;
                    } else if (i2 == 2) {
                        iconCompatParcelizer.RemoteActionCompatParcelizer--;
                        iconCompatParcelizer.write--;
                    }
                }
            } else if (iconCompatParcelizer.RemoteActionCompatParcelizer <= i) {
                if (iconCompatParcelizer.read == 1) {
                    i -= iconCompatParcelizer.write;
                } else if (iconCompatParcelizer.read == 2) {
                    i += iconCompatParcelizer.write;
                }
            } else if (i2 == 1) {
                iconCompatParcelizer.RemoteActionCompatParcelizer++;
            } else if (i2 == 2) {
                iconCompatParcelizer.RemoteActionCompatParcelizer--;
            }
        }
        for (int size2 = this.IconCompatParcelizer.size() - 1; size2 >= 0; size2--) {
            IconCompatParcelizer iconCompatParcelizer2 = this.IconCompatParcelizer.get(size2);
            if (iconCompatParcelizer2.read == 8) {
                if (iconCompatParcelizer2.write == iconCompatParcelizer2.RemoteActionCompatParcelizer || iconCompatParcelizer2.write < 0) {
                    this.IconCompatParcelizer.remove(size2);
                    AudioAttributesCompatParcelizer(iconCompatParcelizer2);
                }
            } else if (iconCompatParcelizer2.write <= 0) {
                this.IconCompatParcelizer.remove(size2);
                AudioAttributesCompatParcelizer(iconCompatParcelizer2);
            }
        }
        return i;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        int size = this.IconCompatParcelizer.size();
        for (int i2 = 0; i2 < size; i2++) {
            IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer.get(i2);
            if (iconCompatParcelizer.read == 8) {
                if (RemoteActionCompatParcelizer(iconCompatParcelizer.write, i2 + 1) == i) {
                    return true;
                }
            } else if (iconCompatParcelizer.read == 1) {
                int i3 = iconCompatParcelizer.RemoteActionCompatParcelizer;
                int i4 = iconCompatParcelizer.write;
                for (int i5 = iconCompatParcelizer.RemoteActionCompatParcelizer; i5 < i3 + i4; i5++) {
                    if (RemoteActionCompatParcelizer(i5, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void write(IconCompatParcelizer iconCompatParcelizer) {
        AudioAttributesImplApi26Parcelizer(iconCompatParcelizer);
    }

    private void AudioAttributesImplApi26Parcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer.add(iconCompatParcelizer);
        int i = iconCompatParcelizer.read;
        if (i == 1) {
            this.AudioAttributesCompatParcelizer.read(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
            return;
        }
        if (i == 2) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
        } else if (i == 4) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write, iconCompatParcelizer.AudioAttributesCompatParcelizer);
        } else {
            if (i == 8) {
                this.AudioAttributesCompatParcelizer.write(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(iconCompatParcelizer)));
        }
    }

    public final boolean read() {
        return this.write.size() > 0;
    }

    public final boolean read(int i) {
        return (this.AudioAttributesImplBaseParcelizer & i) != 0;
    }

    public final int write(int i) {
        return RemoteActionCompatParcelizer(i, 0);
    }

    private int RemoteActionCompatParcelizer(int i, int i2) {
        int size = this.IconCompatParcelizer.size();
        while (i2 < size) {
            IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer.get(i2);
            if (iconCompatParcelizer.read == 8) {
                if (iconCompatParcelizer.RemoteActionCompatParcelizer == i) {
                    i = iconCompatParcelizer.write;
                } else {
                    if (iconCompatParcelizer.RemoteActionCompatParcelizer < i) {
                        i--;
                    }
                    if (iconCompatParcelizer.write <= i) {
                        i++;
                    }
                }
            } else if (iconCompatParcelizer.RemoteActionCompatParcelizer > i) {
                continue;
            } else if (iconCompatParcelizer.read == 2) {
                if (i < iconCompatParcelizer.RemoteActionCompatParcelizer + iconCompatParcelizer.write) {
                    return -1;
                }
                i -= iconCompatParcelizer.write;
            } else if (iconCompatParcelizer.read == 1) {
                i += iconCompatParcelizer.write;
            }
            i2++;
        }
        return i;
    }

    public final boolean IconCompatParcelizer(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.write.add(AudioAttributesCompatParcelizer(4, i, i2, obj));
        this.AudioAttributesImplBaseParcelizer |= 4;
        return this.write.size() == 1;
    }

    public final boolean IconCompatParcelizer(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.write.add(AudioAttributesCompatParcelizer(1, i, i2, null));
        this.AudioAttributesImplBaseParcelizer |= 1;
        return this.write.size() == 1;
    }

    public final boolean write(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.write.add(AudioAttributesCompatParcelizer(2, i, i2, null));
        this.AudioAttributesImplBaseParcelizer |= 2;
        return this.write.size() == 1;
    }

    public final boolean read(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        this.write.add(AudioAttributesCompatParcelizer(8, i, i2, null));
        this.AudioAttributesImplBaseParcelizer |= 8;
        return this.write.size() == 1;
    }

    public final void write() {
        IconCompatParcelizer();
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.write.get(i);
            int i2 = iconCompatParcelizer.read;
            if (i2 == 1) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
                this.AudioAttributesCompatParcelizer.read(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
            } else if (i2 == 2) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
            } else if (i2 == 4) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write, iconCompatParcelizer.AudioAttributesCompatParcelizer);
            } else if (i2 == 8) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
                this.AudioAttributesCompatParcelizer.write(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.write);
            }
        }
        RemoteActionCompatParcelizer(this.write);
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    public final int IconCompatParcelizer(int i) {
        int size = this.write.size();
        for (int i2 = 0; i2 < size; i2++) {
            IconCompatParcelizer iconCompatParcelizer = this.write.get(i2);
            int i3 = iconCompatParcelizer.read;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (iconCompatParcelizer.RemoteActionCompatParcelizer == i) {
                            i = iconCompatParcelizer.write;
                        } else {
                            if (iconCompatParcelizer.RemoteActionCompatParcelizer < i) {
                                i--;
                            }
                            if (iconCompatParcelizer.write <= i) {
                                i++;
                            }
                        }
                    }
                } else if (iconCompatParcelizer.RemoteActionCompatParcelizer > i) {
                    continue;
                } else {
                    if (iconCompatParcelizer.RemoteActionCompatParcelizer + iconCompatParcelizer.write > i) {
                        return -1;
                    }
                    i -= iconCompatParcelizer.write;
                }
            } else if (iconCompatParcelizer.RemoteActionCompatParcelizer <= i) {
                i += iconCompatParcelizer.write;
            }
        }
        return i;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return (this.IconCompatParcelizer.isEmpty() || this.write.isEmpty()) ? false : true;
    }

    public static final class IconCompatParcelizer {
        public Object AudioAttributesCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;

        IconCompatParcelizer(int i, int i2, int i3, Object obj) {
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesCompatParcelizer = obj;
        }

        private String IconCompatParcelizer() {
            int i = this.read;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            return "??";
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(IconCompatParcelizer());
            sb.append(",s:");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("c:");
            sb.append(this.write);
            sb.append(",p:");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            int i = this.read;
            if (i != iconCompatParcelizer.read) {
                return false;
            }
            if (i == 8 && Math.abs(this.write - this.RemoteActionCompatParcelizer) == 1 && this.write == iconCompatParcelizer.RemoteActionCompatParcelizer && this.RemoteActionCompatParcelizer == iconCompatParcelizer.write) {
                return true;
            }
            if (this.write != iconCompatParcelizer.write || this.RemoteActionCompatParcelizer != iconCompatParcelizer.RemoteActionCompatParcelizer) {
                return false;
            }
            Object obj2 = this.AudioAttributesCompatParcelizer;
            if (obj2 != null) {
                if (!obj2.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer)) {
                    return false;
                }
            } else if (iconCompatParcelizer.AudioAttributesCompatParcelizer != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.read * 31) + this.RemoteActionCompatParcelizer) * 31) + this.write;
        }
    }

    @Override // o.deserializexfHcF5w.read
    public final IconCompatParcelizer AudioAttributesCompatParcelizer(int i, int i2, int i3, Object obj) {
        IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            return new IconCompatParcelizer(i, i2, i3, obj);
        }
        iconCompatParcelizerRemoteActionCompatParcelizer.read = i;
        iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = i2;
        iconCompatParcelizerRemoteActionCompatParcelizer.write = i3;
        iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer = obj;
        return iconCompatParcelizerRemoteActionCompatParcelizer;
    }

    @Override // o.deserializexfHcF5w.read
    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        if (this.read) {
            return;
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer = null;
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    private void RemoteActionCompatParcelizer(List<IconCompatParcelizer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AudioAttributesCompatParcelizer(list.get(i));
        }
        list.clear();
    }
}
