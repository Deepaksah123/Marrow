package com.marrow2.ui.common.commonview;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.marrow2.ui.common.commonview.CustomAppBarLayout;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow2/ui/common/commonview/CustomAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/marrow2/ui/common/commonview/CustomAppBarLayout$RemoteActionCompatParcelizer;", "", "setStateChangeListener", "(Lcom/marrow2/ui/common/commonview/CustomAppBarLayout$RemoteActionCompatParcelizer;)V", "RatingCompat", "()V", "write", "Lcom/marrow2/ui/common/commonview/CustomAppBarLayout$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAppBarLayout extends AppBarLayout {
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppBarLayout(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        RatingCompat();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        RatingCompat();
    }

    public final void setStateChangeListener(RemoteActionCompatParcelizer p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    private final void RatingCompat() {
        RemoteActionCompatParcelizer(new AppBarLayout.write() { // from class: o.lambdainputFormatChanged2comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher
            @Override // com.google.android.material.appbar.AppBarLayout.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer(AppBarLayout appBarLayout, int i) {
                CustomAppBarLayout.write(this.IconCompatParcelizer, appBarLayout, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(CustomAppBarLayout customAppBarLayout, AppBarLayout appBarLayout, int i) {
        int i2;
        int i3;
        toMagicModuleMetaRepoModel.write(appBarLayout, "");
        if (customAppBarLayout.RemoteActionCompatParcelizer != null) {
            if (i == 0) {
                int i4 = customAppBarLayout.AudioAttributesCompatParcelizer;
                i3 = 1;
            } else {
                if (Math.abs(i) >= appBarLayout.AudioAttributesImplApi21Parcelizer()) {
                    i2 = 2;
                    if (customAppBarLayout.AudioAttributesCompatParcelizer != 2) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = customAppBarLayout.RemoteActionCompatParcelizer;
                    }
                } else {
                    i2 = 3;
                    if (customAppBarLayout.AudioAttributesCompatParcelizer != 3) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = customAppBarLayout.RemoteActionCompatParcelizer;
                    }
                }
                i3 = i2;
            }
            customAppBarLayout.AudioAttributesCompatParcelizer = i3;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/marrow2/ui/common/commonview/CustomAppBarLayout$RemoteActionCompatParcelizer;", "", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.common.commonview.CustomAppBarLayout$RemoteActionCompatParcelizer$read, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

            private Companion() {
            }
        }
    }
}
