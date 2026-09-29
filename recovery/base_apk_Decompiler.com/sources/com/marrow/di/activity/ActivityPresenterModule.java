package com.marrow.di.activity;

import android.app.Activity;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter;
import com.marrow.ui.activities.plan.PlanContract;
import com.marrow.ui.activities.plan.PlanPresenter;
import kotlin.DvbParserClutDefinition;
import kotlin.DvbParserRegionObject;
import kotlin.Metadata;
import kotlin.SsManifest;
import kotlin.SsManifestParserElementParser;
import kotlin.WebvttCssStyleFontSizeUnit;
import kotlin.addChild;
import kotlin.buildTrackEncryptionBoxes;
import kotlin.fromStyleLine;
import kotlin.getChunkDurationUs;
import kotlin.parseAlignment;
import kotlin.parseRequiredInt;
import kotlin.parseStyleDeclaration;
import kotlin.putNormalizedAttribute;
import kotlin.readCueTarget;
import kotlin.setLivePresentationDelayMs;
import kotlin.setTargetClasses;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001b¢\u0006\u0004\b\u0007\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0017\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020!¢\u0006\u0004\b\u0017\u0010#J\u0015\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0013\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020'¢\u0006\u0004\b\u0013\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0015\u0010\u000b\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020-¢\u0006\u0004\b\u000b\u0010/J\u0015\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u0002042\u0006\u0010\u0005\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00105\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b5\u00108J\u0015\u00105\u001a\u00020:2\u0006\u0010\u0005\u001a\u000209¢\u0006\u0004\b5\u0010;"}, d2 = {"Lcom/marrow/di/activity/ActivityPresenterModule;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "Lo/WebvttCssStyleFontSizeUnit$write;", "read", "(Landroid/app/Activity;)Lo/WebvttCssStyleFontSizeUnit$write;", "Lo/setTargetClasses;", "Lo/WebvttCssStyleFontSizeUnit$RemoteActionCompatParcelizer;", "write", "(Lo/setTargetClasses;)Lo/WebvttCssStyleFontSizeUnit$RemoteActionCompatParcelizer;", "Lo/DvbParserClutDefinition$AudioAttributesCompatParcelizer;", "(Landroid/app/Activity;)Lo/DvbParserClutDefinition$AudioAttributesCompatParcelizer;", "Lo/DvbParserRegionObject;", "Lo/DvbParserClutDefinition$read;", "(Lo/DvbParserRegionObject;)Lo/DvbParserClutDefinition$read;", "Lo/SsManifest$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(Landroid/app/Activity;)Lo/SsManifest$AudioAttributesCompatParcelizer;", "Lo/setLivePresentationDelayMs;", "Lo/SsManifest$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/setLivePresentationDelayMs;)Lo/SsManifest$IconCompatParcelizer;", "Lo/buildTrackEncryptionBoxes;", "(Landroid/app/Activity;)Lo/buildTrackEncryptionBoxes;", "Lo/putNormalizedAttribute;", "Lo/parseRequiredInt;", "(Lo/putNormalizedAttribute;)Lo/parseRequiredInt;", "Lo/parseAlignment$write;", "AudioAttributesImplBaseParcelizer", "(Landroid/app/Activity;)Lo/parseAlignment$write;", "Lo/fromStyleLine;", "Lo/parseAlignment$IconCompatParcelizer;", "(Lo/fromStyleLine;)Lo/parseAlignment$IconCompatParcelizer;", "Lcom/marrow/ui/activities/plan/PlanContract$View;", "AudioAttributesImplApi21Parcelizer", "(Landroid/app/Activity;)Lcom/marrow/ui/activities/plan/PlanContract$View;", "Lcom/marrow/ui/activities/plan/PlanPresenter;", "Lcom/marrow/ui/activities/plan/PlanContract$Presenter;", "(Lcom/marrow/ui/activities/plan/PlanPresenter;)Lcom/marrow/ui/activities/plan/PlanContract$Presenter;", "Lo/addChild;", "MediaBrowserCompatItemReceiver", "(Landroid/app/Activity;)Lo/addChild;", "Lo/SsManifestParserElementParser;", "Lo/getChunkDurationUs;", "(Lo/SsManifestParserElementParser;)Lo/getChunkDurationUs;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$AudioAttributesCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "(Landroid/app/Activity;)Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$AudioAttributesCompatParcelizer;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityPresenter;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$Presenter;", "RemoteActionCompatParcelizer", "(Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityPresenter;)Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$Presenter;", "Lo/parseStyleDeclaration$IconCompatParcelizer;", "(Landroid/app/Activity;)Lo/parseStyleDeclaration$IconCompatParcelizer;", "Lo/readCueTarget;", "Lo/parseStyleDeclaration$RemoteActionCompatParcelizer;", "(Lo/readCueTarget;)Lo/parseStyleDeclaration$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityPresenterModule {
    public static final ActivityPresenterModule INSTANCE = new ActivityPresenterModule();

    private ActivityPresenterModule() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebvttCssStyleFontSizeUnit.write read(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (WebvttCssStyleFontSizeUnit.write) p0;
    }

    public final WebvttCssStyleFontSizeUnit.RemoteActionCompatParcelizer write(setTargetClasses p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DvbParserClutDefinition.AudioAttributesCompatParcelizer write(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (DvbParserClutDefinition.AudioAttributesCompatParcelizer) p0;
    }

    public final DvbParserClutDefinition.read read(DvbParserRegionObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SsManifest.AudioAttributesCompatParcelizer IconCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (SsManifest.AudioAttributesCompatParcelizer) p0;
    }

    public final SsManifest.IconCompatParcelizer AudioAttributesCompatParcelizer(setLivePresentationDelayMs p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final buildTrackEncryptionBoxes AudioAttributesCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (buildTrackEncryptionBoxes) p0;
    }

    public final parseRequiredInt read(putNormalizedAttribute p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final parseAlignment.write AudioAttributesImplBaseParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (parseAlignment.write) p0;
    }

    public final parseAlignment.IconCompatParcelizer AudioAttributesCompatParcelizer(fromStyleLine p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PlanContract.View AudioAttributesImplApi21Parcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (PlanContract.View) p0;
    }

    public final PlanContract.Presenter IconCompatParcelizer(PlanPresenter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final addChild MediaBrowserCompatItemReceiver(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (addChild) p0;
    }

    public final getChunkDurationUs write(SsManifestParserElementParser p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UpgradePlanActivityContract.AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) p0;
    }

    public final UpgradePlanActivityContract.Presenter RemoteActionCompatParcelizer(UpgradePlanActivityPresenter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final parseStyleDeclaration.IconCompatParcelizer RemoteActionCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (parseStyleDeclaration.IconCompatParcelizer) p0;
    }

    public final parseStyleDeclaration.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(readCueTarget p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }
}
