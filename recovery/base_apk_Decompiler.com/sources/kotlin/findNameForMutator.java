package kotlin;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class findNameForMutator {
    private final write AudioAttributesCompatParcelizer;

    @Deprecated
    private findNameForMutator(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer(windowInsetsController, this, new finishRootObject(windowInsetsController));
        } else {
            this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(windowInsetsController, this, new finishRootObject(windowInsetsController));
        }
    }

    public findNameForMutator(Window window, View view) {
        finishRootObject finishrootobject = new finishRootObject(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer(window, this, finishrootobject);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(window, this, finishrootobject);
        } else {
            this.AudioAttributesCompatParcelizer = new IconCompatParcelizer(window, finishrootobject);
        }
    }

    @Deprecated
    public static findNameForMutator cF_(WindowInsetsController windowInsetsController) {
        return new findNameForMutator(windowInsetsController);
    }

    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.write(i);
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.read(z);
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    static class write {
        void AudioAttributesCompatParcelizer(int i) {
        }

        public boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        public void RemoteActionCompatParcelizer(boolean z) {
        }

        void read(int i) {
        }

        public void read(boolean z) {
        }

        public boolean read() {
            return false;
        }

        void write(int i) {
        }

        write() {
        }
    }

    static class RemoteActionCompatParcelizer extends write {
        protected final Window IconCompatParcelizer;
        private final finishRootObject write;

        RemoteActionCompatParcelizer(Window window, finishRootObject finishrootobject) {
            this.IconCompatParcelizer = window;
            this.write = finishrootobject;
        }

        @Override // o.findNameForMutator.write
        void write(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    AudioAttributesImplBaseParcelizer(i2);
                }
            }
        }

        private void AudioAttributesImplBaseParcelizer(int i) {
            if (i == 1) {
                MediaBrowserCompatItemReceiver(4);
                MediaBrowserCompatCustomActionResultReceiver(1024);
            } else if (i == 2) {
                MediaBrowserCompatItemReceiver(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.write.read();
            }
        }

        @Override // o.findNameForMutator.write
        void read(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    AudioAttributesImplApi26Parcelizer(i2);
                }
            }
        }

        private void AudioAttributesImplApi26Parcelizer(int i) {
            if (i == 1) {
                RemoteActionCompatParcelizer(4);
            } else if (i == 2) {
                RemoteActionCompatParcelizer(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.write.RemoteActionCompatParcelizer();
            }
        }

        protected void RemoteActionCompatParcelizer(int i) {
            View decorView = this.IconCompatParcelizer.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void MediaBrowserCompatItemReceiver(int i) {
            View decorView = this.IconCompatParcelizer.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void IconCompatParcelizer(int i) {
            this.IconCompatParcelizer.addFlags(i);
        }

        protected void MediaBrowserCompatCustomActionResultReceiver(int i) {
            this.IconCompatParcelizer.clearFlags(i);
        }

        @Override // o.findNameForMutator.write
        void AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i == 0) {
                MediaBrowserCompatItemReceiver(6144);
                return;
            }
            if (i == 1) {
                MediaBrowserCompatItemReceiver(4096);
                RemoteActionCompatParcelizer(2048);
            } else {
                if (i != 2) {
                    return;
                }
                MediaBrowserCompatItemReceiver(2048);
                RemoteActionCompatParcelizer(4096);
            }
        }
    }

    static class read extends RemoteActionCompatParcelizer {
        read(Window window, finishRootObject finishrootobject) {
            super(window, finishrootobject);
        }

        @Override // o.findNameForMutator.write
        public boolean AudioAttributesCompatParcelizer() {
            return (this.IconCompatParcelizer.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // o.findNameForMutator.write
        public void read(boolean z) {
            if (z) {
                MediaBrowserCompatCustomActionResultReceiver(67108864);
                IconCompatParcelizer(Integer.MIN_VALUE);
                RemoteActionCompatParcelizer(8192);
                return;
            }
            MediaBrowserCompatItemReceiver(8192);
        }
    }

    static class IconCompatParcelizer extends read {
        IconCompatParcelizer(Window window, finishRootObject finishrootobject) {
            super(window, finishrootobject);
        }

        @Override // o.findNameForMutator.write
        public boolean read() {
            return (this.IconCompatParcelizer.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // o.findNameForMutator.write
        public void RemoteActionCompatParcelizer(boolean z) {
            if (z) {
                MediaBrowserCompatCustomActionResultReceiver(C.BUFFER_FLAG_FIRST_SAMPLE);
                IconCompatParcelizer(Integer.MIN_VALUE);
                RemoteActionCompatParcelizer(16);
                return;
            }
            MediaBrowserCompatItemReceiver(16);
        }
    }

    static class AudioAttributesCompatParcelizer extends write {
        final WindowInsetsController AudioAttributesCompatParcelizer;
        private final AppCompatCheckBox<Object, WindowInsetsController.OnControllableInsetsChangedListener> IconCompatParcelizer;
        final findNameForMutator RemoteActionCompatParcelizer;
        final finishRootObject read;
        protected Window write;

        AudioAttributesCompatParcelizer(Window window, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            this(window.getInsetsController(), findnameformutator, finishrootobject);
            this.write = window;
        }

        AudioAttributesCompatParcelizer(WindowInsetsController windowInsetsController, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            this.IconCompatParcelizer = new AppCompatCheckBox<>();
            this.AudioAttributesCompatParcelizer = windowInsetsController;
            this.RemoteActionCompatParcelizer = findnameformutator;
            this.read = finishrootobject;
        }

        @Override // o.findNameForMutator.write
        void write(int i) {
            if ((i & 8) != 0) {
                this.read.read();
            }
            this.AudioAttributesCompatParcelizer.show(i & (-9));
        }

        @Override // o.findNameForMutator.write
        void read(int i) {
            if ((i & 8) != 0) {
                this.read.RemoteActionCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer.hide(i & (-9));
        }

        @Override // o.findNameForMutator.write
        public boolean AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(0, 0);
            return (this.AudioAttributesCompatParcelizer.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // o.findNameForMutator.write
        public void read(boolean z) {
            if (z) {
                if (this.write != null) {
                    RemoteActionCompatParcelizer(8192);
                }
                this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(8, 8);
            } else {
                if (this.write != null) {
                    IconCompatParcelizer(8192);
                }
                this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // o.findNameForMutator.write
        public boolean read() {
            this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(0, 0);
            return (this.AudioAttributesCompatParcelizer.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // o.findNameForMutator.write
        public void RemoteActionCompatParcelizer(boolean z) {
            if (z) {
                if (this.write != null) {
                    RemoteActionCompatParcelizer(16);
                }
                this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(16, 16);
            } else {
                if (this.write != null) {
                    IconCompatParcelizer(16);
                }
                this.AudioAttributesCompatParcelizer.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // o.findNameForMutator.write
        void AudioAttributesCompatParcelizer(int i) {
            Window window = this.write;
            if (window != null) {
                window.getDecorView().setTag(356039078, Integer.valueOf(i));
                if (i == 0) {
                    IconCompatParcelizer(6144);
                    return;
                }
                if (i == 1) {
                    IconCompatParcelizer(4096);
                    RemoteActionCompatParcelizer(2048);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    IconCompatParcelizer(2048);
                    RemoteActionCompatParcelizer(4096);
                    return;
                }
            }
            this.AudioAttributesCompatParcelizer.setSystemBarsBehavior(i);
        }

        protected void IconCompatParcelizer(int i) {
            View decorView = this.write.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void RemoteActionCompatParcelizer(int i) {
            View decorView = this.write.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    static class MediaBrowserCompatItemReceiver extends AudioAttributesCompatParcelizer {
        MediaBrowserCompatItemReceiver(Window window, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            super(window, findnameformutator, finishrootobject);
        }

        MediaBrowserCompatItemReceiver(WindowInsetsController windowInsetsController, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            super(windowInsetsController, findnameformutator, finishrootobject);
        }

        @Override // o.findNameForMutator.AudioAttributesCompatParcelizer, o.findNameForMutator.write
        void AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer.setSystemBarsBehavior(i);
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends MediaBrowserCompatItemReceiver {
        AudioAttributesImplApi21Parcelizer(Window window, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            super(window, findnameformutator, finishrootobject);
        }

        AudioAttributesImplApi21Parcelizer(WindowInsetsController windowInsetsController, findNameForMutator findnameformutator, finishRootObject finishrootobject) {
            super(windowInsetsController, findnameformutator, finishrootobject);
        }

        @Override // o.findNameForMutator.AudioAttributesCompatParcelizer, o.findNameForMutator.write
        public boolean AudioAttributesCompatParcelizer() {
            return (this.AudioAttributesCompatParcelizer.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // o.findNameForMutator.AudioAttributesCompatParcelizer, o.findNameForMutator.write
        public boolean read() {
            return (this.AudioAttributesCompatParcelizer.getSystemBarsAppearance() & 16) != 0;
        }
    }
}
