package kotlin;

import android.view.View;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0004\u001a\u0004\u0018\u00010!8\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\b\"\u0010#\"\u0004\b\u001b\u0010$"}, d2 = {"Lo/getFeatureMask;", "Lo/writeArray;", "Lo/setFeatureMask;", "Lo/inset;", "p0", "", "p1", "Lo/assignParameter;", "p2", "Lo/MinimalPrettyPrinter;", "p3", "Lkotlin/Function0;", "Lo/setCurrentValue;", "p4", "<init>", "(Lo/inset;ZFLo/MinimalPrettyPrinter;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/findSetterInfo;", "", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V", "Lo/setOverriddenInsets$read;", "Lo/calloc;", "", "(Lo/setOverriddenInsets$read;JF)V", "(Lo/setOverriddenInsets$read;)V", "MediaDescriptionCompat", "()V", "read", "Landroidx/compose/material/ripple/RippleContainer;", "RatingCompat", "()Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/material/ripple/RippleContainer;", "IconCompatParcelizer", "Landroidx/compose/material/ripple/RippleHostView;", "RemoteActionCompatParcelizer", "Landroidx/compose/material/ripple/RippleHostView;", "(Landroidx/compose/material/ripple/RippleHostView;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFeatureMask extends writeArray implements setFeatureMask {
    private RippleHostView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private RippleContainer IconCompatParcelizer;

    private getFeatureMask(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs<setCurrentValue> getcreatedondatems) {
        super(insetVar, z, f, minimalPrettyPrinter, getcreatedondatems, null);
    }

    private final void read(RippleHostView rippleHostView) {
        this.RemoteActionCompatParcelizer = rippleHostView;
        addDeserializers.read(this);
    }

    @Override // kotlin.writeArray
    public final void AudioAttributesCompatParcelizer(setOverriddenInsets.read p0, long p1, float p2) {
        RippleHostView rippleHostViewIconCompatParcelizer = RatingCompat().IconCompatParcelizer(this);
        rippleHostViewIconCompatParcelizer.RemoteActionCompatParcelizer(p0, getWrite(), p1, getOnline.RemoteActionCompatParcelizer(p2), AudioAttributesImplApi26Parcelizer(), MediaBrowserCompatCustomActionResultReceiver().invoke().getRemoteActionCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.overrideStdFeatures
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getFeatureMask.IconCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        read(rippleHostViewIconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getFeatureMask getfeaturemask) {
        addDeserializers.read(getfeaturemask);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.writeArray
    public final void AudioAttributesCompatParcelizer(setOverriddenInsets.read p0) {
        RippleHostView rippleHostView = this.RemoteActionCompatParcelizer;
        if (rippleHostView != null) {
            rippleHostView.read();
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        RippleContainer rippleContainer = this.IconCompatParcelizer;
        if (rippleContainer != null) {
            rippleContainer.read(this);
        }
    }

    @Override // kotlin.setFeatureMask
    public final void read() {
        read((RippleHostView) null);
    }

    private final RippleContainer RatingCompat() {
        RippleContainer rippleContainer = this.IconCompatParcelizer;
        if (rippleContainer != null) {
            toMagicModuleMetaRepoModel.write(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainer2 = setSchema.read(setSchema.AudioAttributesCompatParcelizer((View) MappingJsonFactory.write(this, AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver())));
        this.IconCompatParcelizer = rippleContainer2;
        toMagicModuleMetaRepoModel.write(rippleContainer2);
        return rippleContainer2;
    }

    @Override // kotlin.writeArray
    public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
        JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
        RippleHostView rippleHostView = this.RemoteActionCompatParcelizer;
        if (rippleHostView != null) {
            rippleHostView.m0setRipplePropertiesbiQXAtU(getMediaBrowserCompatCustomActionResultReceiver(), getOnline.RemoteActionCompatParcelizer(getAudioAttributesImplApi21Parcelizer()), AudioAttributesImplApi26Parcelizer(), MediaBrowserCompatCustomActionResultReceiver().invoke().getRemoteActionCompatParcelizer());
            rippleHostView.draw(balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer));
        }
    }

    public /* synthetic */ getFeatureMask(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(insetVar, z, f, minimalPrettyPrinter, getcreatedondatems);
    }
}
