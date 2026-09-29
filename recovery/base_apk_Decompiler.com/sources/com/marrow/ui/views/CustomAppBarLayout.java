package com.marrow.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.marrow.ui.views.CustomAppBarLayout;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/marrow/ui/views/CustomAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/marrow/ui/views/CustomAppBarLayout$read;", "", "setStateChangeListener", "(Lcom/marrow/ui/views/CustomAppBarLayout$read;)V", "MediaMetadataCompat", "()V", "write", "Lcom/marrow/ui/views/CustomAppBarLayout$read;", "RemoteActionCompatParcelizer", "", "I", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAppBarLayout extends AppBarLayout {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private read RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppBarLayout(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        MediaMetadataCompat();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        MediaMetadataCompat();
    }

    public final void setStateChangeListener(read p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    private final void MediaMetadataCompat() {
        RemoteActionCompatParcelizer(new AppBarLayout.write() { // from class: o.getProgressText
            @Override // com.google.android.material.appbar.AppBarLayout.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer(AppBarLayout appBarLayout, int i) {
                CustomAppBarLayout.write(this.read, appBarLayout, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(CustomAppBarLayout customAppBarLayout, AppBarLayout appBarLayout, int i) {
        int i2;
        read readVar;
        read readVar2;
        toMagicModuleMetaRepoModel.write(appBarLayout, "");
        read readVar3 = customAppBarLayout.RemoteActionCompatParcelizer;
        if (readVar3 != null) {
            if (i == 0) {
                i2 = 1;
                if (customAppBarLayout.AudioAttributesCompatParcelizer != 1 && readVar3 != null) {
                    readVar3.IconCompatParcelizer(1);
                }
            } else if (Math.abs(i) >= appBarLayout.AudioAttributesImplApi21Parcelizer()) {
                i2 = 2;
                if (customAppBarLayout.AudioAttributesCompatParcelizer != 2 && (readVar2 = customAppBarLayout.RemoteActionCompatParcelizer) != null) {
                    readVar2.IconCompatParcelizer(2);
                }
            } else {
                i2 = 3;
                if (customAppBarLayout.AudioAttributesCompatParcelizer != 3 && (readVar = customAppBarLayout.RemoteActionCompatParcelizer) != null) {
                    readVar.IconCompatParcelizer(3);
                }
            }
            customAppBarLayout.AudioAttributesCompatParcelizer = i2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/CustomAppBarLayout$read;", "", "", "p0", "", "IconCompatParcelizer", "(I)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface read {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.write;

        void IconCompatParcelizer(int p0);

        /* JADX INFO: renamed from: com.marrow.ui.views.CustomAppBarLayout$read$read, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion write = new Companion();

            private Companion() {
            }
        }
    }
}
