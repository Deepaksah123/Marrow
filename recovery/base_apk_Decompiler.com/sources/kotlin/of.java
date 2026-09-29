package kotlin;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NioPathSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class of {
    private final View IconCompatParcelizer;
    private int read;
    private final ArrayList<write> RemoteActionCompatParcelizer = new ArrayList<>();
    private _verifyEndArrayForSingle AudioAttributesCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
    private _verifyEndArrayForSingle write = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;

    interface write {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2);

        void RemoteActionCompatParcelizer();

        void read();

        void write(int i, _verifyEndArrayForSingle _verifyendarrayforsingle, RectF rectF);
    }

    public of(final ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        this.read = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        View view = new View(viewGroup.getContext()) { // from class: o.of.1
            @Override // android.view.View
            protected final void onConfigurationChanged(Configuration configuration) {
                Drawable background2 = viewGroup.getBackground();
                int color = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                if (of.this.read != color) {
                    of.this.read = color;
                    for (int size = of.this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                        ((write) of.this.RemoteActionCompatParcelizer.get(size)).read();
                    }
                }
            }
        };
        this.IconCompatParcelizer = view;
        view.setWillNotDraw(true);
        InvalidTypeIdException.read(view, new finishBranchObject() { // from class: o._creators
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.IconCompatParcelizer.RemoteActionCompatParcelizer(windowInsetsCompat);
            }
        });
        InvalidTypeIdException.IconCompatParcelizer(view, new NioPathSerializer.read() { // from class: o.of.4
            private final HashMap<NioPathSerializer, Integer> write = new HashMap<>();

            @Override // o.NioPathSerializer.read
            public final void write(NioPathSerializer nioPathSerializer) {
                if (AudioAttributesCompatParcelizer(nioPathSerializer)) {
                    for (int size = of.this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                        ((write) of.this.RemoteActionCompatParcelizer.get(size)).RemoteActionCompatParcelizer();
                    }
                }
            }

            @Override // o.NioPathSerializer.read
            public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer nioPathSerializer, NioPathSerializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                if (!AudioAttributesCompatParcelizer(nioPathSerializer)) {
                    return remoteActionCompatParcelizer;
                }
                _verifyEndArrayForSingle _verifyendarrayforsingleWrite = remoteActionCompatParcelizer.write();
                _verifyEndArrayForSingle _verifyendarrayforsingleIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                int i = _verifyendarrayforsingleWrite.read != _verifyendarrayforsingleIconCompatParcelizer.read ? 1 : 0;
                if (_verifyendarrayforsingleWrite.write != _verifyendarrayforsingleIconCompatParcelizer.write) {
                    i |= 2;
                }
                if (_verifyendarrayforsingleWrite.IconCompatParcelizer != _verifyendarrayforsingleIconCompatParcelizer.IconCompatParcelizer) {
                    i |= 4;
                }
                if (_verifyendarrayforsingleWrite.AudioAttributesCompatParcelizer != _verifyendarrayforsingleIconCompatParcelizer.AudioAttributesCompatParcelizer) {
                    i |= 8;
                }
                this.write.put(nioPathSerializer, Integer.valueOf(i));
                return remoteActionCompatParcelizer;
            }

            @Override // o.NioPathSerializer.read
            public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat, List<NioPathSerializer> list) {
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    NioPathSerializer nioPathSerializer = list.get(size);
                    Integer num = this.write.get(nioPathSerializer);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fRemoteActionCompatParcelizer = nioPathSerializer.RemoteActionCompatParcelizer();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fRemoteActionCompatParcelizer;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fRemoteActionCompatParcelizer;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fRemoteActionCompatParcelizer;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fRemoteActionCompatParcelizer;
                        }
                        i |= iIntValue;
                    }
                }
                _verifyEndArrayForSingle _verifyendarrayforsingle = of.read(windowInsetsCompat);
                for (int size2 = of.this.RemoteActionCompatParcelizer.size() - 1; size2 >= 0; size2--) {
                    ((write) of.this.RemoteActionCompatParcelizer.get(size2)).write(i, _verifyendarrayforsingle, rectF);
                }
                return windowInsetsCompat;
            }

            @Override // o.NioPathSerializer.read
            public final void IconCompatParcelizer(NioPathSerializer nioPathSerializer) {
                if (AudioAttributesCompatParcelizer(nioPathSerializer)) {
                    this.write.remove(nioPathSerializer);
                    for (int size = of.this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                        ((write) of.this.RemoteActionCompatParcelizer.get(size)).AudioAttributesCompatParcelizer();
                    }
                }
            }

            private static boolean AudioAttributesCompatParcelizer(NioPathSerializer nioPathSerializer) {
                return (nioPathSerializer.IconCompatParcelizer() & WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()) != 0;
            }
        });
        viewGroup.addView(view, 0);
    }

    final /* synthetic */ WindowInsetsCompat RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        _verifyEndArrayForSingle _verifyendarrayforsingle = read(windowInsetsCompat);
        _verifyEndArrayForSingle _verifyendarrayforsingleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(windowInsetsCompat);
        if (!_verifyendarrayforsingle.equals(this.AudioAttributesCompatParcelizer) || !_verifyendarrayforsingleAudioAttributesCompatParcelizer.equals(this.write)) {
            this.AudioAttributesCompatParcelizer = _verifyendarrayforsingle;
            this.write = _verifyendarrayforsingleAudioAttributesCompatParcelizer;
            for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                this.RemoteActionCompatParcelizer.get(size).AudioAttributesCompatParcelizer(_verifyendarrayforsingle, _verifyendarrayforsingleAudioAttributesCompatParcelizer);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static _verifyEndArrayForSingle read(WindowInsetsCompat windowInsetsCompat) {
        return _verifyEndArrayForSingle.IconCompatParcelizer(windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()), windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()));
    }

    private static _verifyEndArrayForSingle AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        return _verifyEndArrayForSingle.IconCompatParcelizer(windowInsetsCompat.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()), windowInsetsCompat.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer()));
    }

    final void AudioAttributesCompatParcelizer(write writeVar) {
        if (this.RemoteActionCompatParcelizer.contains(writeVar)) {
            return;
        }
        this.RemoteActionCompatParcelizer.add(writeVar);
        writeVar.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write);
        writeVar.read();
    }

    final void RemoteActionCompatParcelizer(write writeVar) {
        this.RemoteActionCompatParcelizer.remove(writeVar);
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return !this.RemoteActionCompatParcelizer.isEmpty();
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.post(new Runnable() { // from class: o.hasOneOf
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.read();
            }
        });
    }

    final /* synthetic */ void read() {
        ViewParent parent = this.IconCompatParcelizer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.IconCompatParcelizer);
        }
    }
}
