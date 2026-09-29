package kotlin;

import android.graphics.Bitmap;
import android.view.View;
import java.util.UUID;
import kotlin.lambdasetRepeatMode3;

/* JADX INFO: loaded from: classes2.dex */
public final class createMessageInternal implements View.OnAttachStateChangeListener {
    private boolean AudioAttributesCompatParcelizer;
    private volatile lambdasetRepeatMode3.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private volatile setPassingYear AudioAttributesImplApi26Parcelizer;
    private createDeviceInfo IconCompatParcelizer;
    private volatile setPassingYear read;
    private volatile UUID write;
    private boolean AudioAttributesImplBaseParcelizer = true;
    private final AppCompatCheckBox<Object, Bitmap> RemoteActionCompatParcelizer = new AppCompatCheckBox<>();

    public final void read(lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
    }

    public final Bitmap RemoteActionCompatParcelizer(Object obj, Bitmap bitmap) {
        toMagicModuleMetaRepoModel.write(obj, "");
        if (bitmap != null) {
            return this.RemoteActionCompatParcelizer.put(obj, bitmap);
        }
        return this.RemoteActionCompatParcelizer.remove(obj);
    }

    public final void read(createDeviceInfo createdeviceinfo) {
        if (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = false;
        } else {
            this.AudioAttributesImplApi26Parcelizer = null;
        }
        createDeviceInfo createdeviceinfo2 = this.IconCompatParcelizer;
        if (createdeviceinfo2 != null) {
            createdeviceinfo2.write();
        }
        this.IconCompatParcelizer = createdeviceinfo;
        this.AudioAttributesImplBaseParcelizer = true;
    }

    public final UUID IconCompatParcelizer(setPassingYear setpassingyear) {
        toMagicModuleMetaRepoModel.write(setpassingyear, "");
        UUID uuidRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        this.write = uuidRemoteActionCompatParcelizer;
        this.read = setpassingyear;
        return uuidRemoteActionCompatParcelizer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplBaseParcelizer = false;
            return;
        }
        createDeviceInfo createdeviceinfo = this.IconCompatParcelizer;
        if (createdeviceinfo == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        createdeviceinfo.IconCompatParcelizer();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        this.AudioAttributesImplBaseParcelizer = false;
        createDeviceInfo createdeviceinfo = this.IconCompatParcelizer;
        if (createdeviceinfo == null) {
            return;
        }
        createdeviceinfo.write();
    }

    private final UUID RemoteActionCompatParcelizer() {
        UUID uuid = this.write;
        if (uuid != null && this.AudioAttributesCompatParcelizer && sendRendererMessage.IconCompatParcelizer()) {
            return uuid;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uuidRandomUUID, "");
        return uuidRandomUUID;
    }
}
