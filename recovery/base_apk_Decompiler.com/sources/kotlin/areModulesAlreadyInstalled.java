package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.common.bookmark.BookmarkPopupWindow;
import com.marrow2.ui.pearl.viewmodel.PearlDetailInnerViewModel;
import kotlin.ConnectionTracker;
import kotlin.LoggingConstants;
import kotlin.Metadata;
import kotlin.ModuleInstall;
import kotlin.VisibilityChecker;
import kotlin.concatByteArrays;
import kotlin.getAutofillClient;
import kotlin.getPublicKeyCredential;
import kotlin.signOut;
import kotlin.unbindServiceSafe;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0011\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\"H\u0002¢\u0006\u0004\b\u0013\u0010#J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0013\u0010$J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0003R\u0016\u0010\u0013\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001b\u0010\u001a\u001a\u00020(8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b\u0017\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,"}, d2 = {"Lo/areModulesAlreadyInstalled;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "write", "Lo/AndroidUtilsLight;", "IconCompatParcelizer", "(Lo/AndroidUtilsLight;)V", "AudioAttributesImplBaseParcelizer", "", "read", "(Ljava/lang/String;)V", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "MediaMetadataCompat", "", "(I)V", "(Z)V", "MediaDescriptionCompat", "Lo/HlsChunkSourceEncryptionKeyChunk;", "Lo/HlsChunkSourceEncryptionKeyChunk;", "Lcom/marrow2/ui/pearl/viewmodel/PearlDetailInnerViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/pearl/viewmodel/PearlDetailInnerViewModel;", "Lo/signOut;", "Lo/signOut;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class areModulesAlreadyInstalled extends areModulesAvailable {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private signOut write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private HlsChunkSourceEncryptionKeyChunk IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    public areModulesAlreadyInstalled() {
        areModulesAlreadyInstalled aremodulesalreadyinstalled = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(aremodulesalreadyinstalled)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PearlDetailInnerViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(aremodulesalreadyinstalled, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PearlDetailInnerViewModel read() {
        return (PearlDetailInnerViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer = HlsChunkSourceEncryptionKeyChunk.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = hlsChunkSourceEncryptionKeyChunkAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        MediaDescriptionCompat();
        AudioAttributesCompatParcelizer();
        write();
        if (p1 == null) {
            areModulesAlreadyInstalled aremodulesalreadyinstalled = this;
            ModuleInstall.Companion companion = ModuleInstall.INSTANCE;
            ConnectionTracker.IconCompatParcelizer iconCompatParcelizer = ConnectionTracker.RemoteActionCompatParcelizer;
            Bundle bundleRequireArguments = requireArguments();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
            CmcdConfigurationRequestConfig.write(aremodulesalreadyinstalled, R.id.pearl_content_container, ModuleInstall.Companion.read(ConnectionTracker.IconCompatParcelizer.read(bundleRequireArguments)));
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk = null;
        }
        hlsChunkSourceEncryptionKeyChunk.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.PooledExecutorsProviderPooledExecutorFactory
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.handleMediaPlayPauseIfPendingOnHandler(this.write);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.write.setOnClickListener(new View.OnClickListener() { // from class: o.ApiFeatureRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.onCustomAction(this.read);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.PooledExecutorsProvider
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.onCommand(this.RemoteActionCompatParcelizer);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isPrimitiveFieldSet
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.onAddQueueItem(this.read);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.StringToIntConverter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.IconCompatParcelizer);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.RemoteActionCompatParcelizer.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.getTotalBytesToDownload
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return areModulesAlreadyInstalled.onPlay(this.AudioAttributesCompatParcelizer);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.write.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.ModuleInstallStatusUpdateProgressInfo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return areModulesAlreadyInstalled.onFastForward(this.read);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.getInstallState
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return areModulesAlreadyInstalled.onPlayFromMediaId(this.IconCompatParcelizer);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.ModuleInstallStatusUpdateInstallState
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.onMediaButtonEvent(this.AudioAttributesCompatParcelizer);
            }
        });
        hlsChunkSourceEncryptionKeyChunk.RatingCompat.setOnClickListener(new View.OnClickListener() { // from class: o.getProgressInfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                areModulesAlreadyInstalled.onPause(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMediaPlayPauseIfPendingOnHandler(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomAction(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCommand(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddQueueItem(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPlay(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        return aremodulesalreadyinstalled.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFastForward(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        return aremodulesalreadyinstalled.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPlayFromMediaId(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        return aremodulesalreadyinstalled.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMediaButtonEvent(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.read().AudioAttributesCompatParcelizer(LoggingConstants.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPause(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        aremodulesalreadyinstalled.AudioAttributesImplBaseParcelizer();
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight>> isdarkMediaBrowserCompatCustomActionResultReceiver = areModulesAlreadyInstalled.this.read().MediaBrowserCompatCustomActionResultReceiver();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.IconCompatParcelizer = 1;
                if (isdarkMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object read(DataSourceBitmapLoaderExternalSyntheticLambda0<AndroidUtilsLight> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = aremodulesalreadyinstalled.IconCompatParcelizer;
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk2 = null;
                            if (hlsChunkSourceEncryptionKeyChunk == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                hlsChunkSourceEncryptionKeyChunk = null;
                            }
                            ConstraintLayout constraintLayout = hlsChunkSourceEncryptionKeyChunk.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            int iAudioAttributesImplApi26Parcelizer = ((AndroidUtilsLight) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesImplApi26Parcelizer();
                            areModulesAlreadyInstalled aremodulesalreadyinstalled2 = aremodulesalreadyinstalled;
                            if (iAudioAttributesImplApi26Parcelizer > 0) {
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk3 = aremodulesalreadyinstalled2.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    hlsChunkSourceEncryptionKeyChunk3 = null;
                                }
                                hlsChunkSourceEncryptionKeyChunk3.RatingCompat.setText(aremodulesalreadyinstalled2.getString(R.string.related_mcq, QBankStatsResponse.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer)));
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk4 = aremodulesalreadyinstalled2.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    hlsChunkSourceEncryptionKeyChunk4 = null;
                                }
                                CardView cardView = hlsChunkSourceEncryptionKeyChunk4.MediaDescriptionCompat;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
                                PlayerControlViewExternalSyntheticLambda1.write(cardView);
                            } else {
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk5 = aremodulesalreadyinstalled2.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    hlsChunkSourceEncryptionKeyChunk5 = null;
                                }
                                TextView textView = hlsChunkSourceEncryptionKeyChunk5.RatingCompat;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
                            }
                            String str = ((AndroidUtilsLight) decodebitmap.RemoteActionCompatParcelizer()).read();
                            areModulesAlreadyInstalled aremodulesalreadyinstalled3 = aremodulesalreadyinstalled;
                            if (str.length() == 0) {
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk6 = aremodulesalreadyinstalled3.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    hlsChunkSourceEncryptionKeyChunk2 = hlsChunkSourceEncryptionKeyChunk6;
                                }
                                LinearLayout linearLayout = hlsChunkSourceEncryptionKeyChunk2.AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
                            } else {
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk7 = aremodulesalreadyinstalled3.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk7 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    hlsChunkSourceEncryptionKeyChunk7 = null;
                                }
                                hlsChunkSourceEncryptionKeyChunk7.MediaBrowserCompatItemReceiver.setText(aremodulesalreadyinstalled3.getString(R.string.pearl_display_id, str));
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk8 = aremodulesalreadyinstalled3.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk8 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    hlsChunkSourceEncryptionKeyChunk8 = null;
                                }
                                hlsChunkSourceEncryptionKeyChunk8.MediaBrowserCompatItemReceiver.setTag(str);
                                HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk9 = aremodulesalreadyinstalled3.IconCompatParcelizer;
                                if (hlsChunkSourceEncryptionKeyChunk9 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    hlsChunkSourceEncryptionKeyChunk2 = hlsChunkSourceEncryptionKeyChunk9;
                                }
                                LinearLayout linearLayout2 = hlsChunkSourceEncryptionKeyChunk2.AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                                PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
                            }
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write() {
        areModulesAlreadyInstalled aremodulesalreadyinstalled = this;
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new IconCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(aremodulesalreadyinstalled, new AudioAttributesImplBaseParcelizer(null));
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Integer> isdarkIconCompatParcelizer = areModulesAlreadyInstalled.this.read().IconCompatParcelizer();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.IconCompatParcelizer = 1;
                if (isdarkIconCompatParcelizer.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object IconCompatParcelizer(int i2) {
                        aremodulesalreadyinstalled.IconCompatParcelizer(i2);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<String> isdark = areModulesAlreadyInstalled.this.read().read();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((String) obj2);
                    }

                    private Object read(String str) {
                        if (str.length() == 0) {
                            return getShowPopup.INSTANCE;
                        }
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(aremodulesalreadyinstalled, str, 0);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean>> isdarkMediaBrowserCompatItemReceiver = areModulesAlreadyInstalled.this.read().MediaBrowserCompatItemReceiver();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdarkMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = null;
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk2 = aremodulesalreadyinstalled.IconCompatParcelizer;
                            if (hlsChunkSourceEncryptionKeyChunk2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                hlsChunkSourceEncryptionKeyChunk2 = null;
                            }
                            FrameLayout frameLayout = hlsChunkSourceEncryptionKeyChunk2.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk3 = aremodulesalreadyinstalled.IconCompatParcelizer;
                            if (hlsChunkSourceEncryptionKeyChunk3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                hlsChunkSourceEncryptionKeyChunk = hlsChunkSourceEncryptionKeyChunk3;
                            }
                            TextView textView = hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk4 = aremodulesalreadyinstalled.IconCompatParcelizer;
                            if (hlsChunkSourceEncryptionKeyChunk4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                hlsChunkSourceEncryptionKeyChunk4 = null;
                            }
                            FrameLayout frameLayout2 = hlsChunkSourceEncryptionKeyChunk4.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout2);
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk5 = aremodulesalreadyinstalled.IconCompatParcelizer;
                            if (hlsChunkSourceEncryptionKeyChunk5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                hlsChunkSourceEncryptionKeyChunk = hlsChunkSourceEncryptionKeyChunk5;
                            }
                            TextView textView2 = hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<unbindServiceSafe> isdarkAudioAttributesCompatParcelizer = areModulesAlreadyInstalled.this.read().AudioAttributesCompatParcelizer();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((unbindServiceSafe) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(unbindServiceSafe unbindservicesafe) {
                        if (unbindservicesafe instanceof unbindServiceSafe.read) {
                            aremodulesalreadyinstalled.read(((unbindServiceSafe.read) unbindservicesafe).AudioAttributesCompatParcelizer());
                        } else if (unbindservicesafe instanceof unbindServiceSafe.RemoteActionCompatParcelizer) {
                            unbindServiceSafe.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (unbindServiceSafe.RemoteActionCompatParcelizer) unbindservicesafe;
                            aremodulesalreadyinstalled.write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.read());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(unbindservicesafe, unbindServiceSafe.write.INSTANCE)) {
                            if (unbindservicesafe instanceof unbindServiceSafe.MediaBrowserCompatCustomActionResultReceiver) {
                                aremodulesalreadyinstalled.IconCompatParcelizer(((unbindServiceSafe.MediaBrowserCompatCustomActionResultReceiver) unbindservicesafe).RemoteActionCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(unbindservicesafe, unbindServiceSafe.MediaBrowserCompatItemReceiver.INSTANCE)) {
                                aremodulesalreadyinstalled.MediaMetadataCompat();
                            } else if (unbindservicesafe instanceof unbindServiceSafe.AudioAttributesImplApi26Parcelizer) {
                                aremodulesalreadyinstalled.IconCompatParcelizer(((unbindServiceSafe.AudioAttributesImplApi26Parcelizer) unbindservicesafe).read());
                            } else if (unbindservicesafe instanceof unbindServiceSafe.AudioAttributesCompatParcelizer) {
                                aremodulesalreadyinstalled.IconCompatParcelizer(((unbindServiceSafe.AudioAttributesCompatParcelizer) unbindservicesafe).write());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(unbindservicesafe, unbindServiceSafe.IconCompatParcelizer.INSTANCE)) {
                                aremodulesalreadyinstalled.AudioAttributesImplApi26Parcelizer();
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Boolean> isdarkAudioAttributesImplApi26Parcelizer = areModulesAlreadyInstalled.this.read().AudioAttributesImplApi26Parcelizer();
                final areModulesAlreadyInstalled aremodulesalreadyinstalled = areModulesAlreadyInstalled.this;
                this.write = 1;
                if (isdarkAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.areModulesAlreadyInstalled.AudioAttributesImplBaseParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        if (z) {
                            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = aremodulesalreadyinstalled.IconCompatParcelizer;
                            if (hlsChunkSourceEncryptionKeyChunk == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                hlsChunkSourceEncryptionKeyChunk = null;
                            }
                            hlsChunkSourceEncryptionKeyChunk.IconCompatParcelizer.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplApi21Parcelizer.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.RemoteActionCompatParcelizer.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.write.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.MediaBrowserCompatItemReceiver.setClickable(false);
                            hlsChunkSourceEncryptionKeyChunk.RatingCompat.setClickable(false);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return areModulesAlreadyInstalled.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(AndroidUtilsLight p0) {
        String str;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "image", (Object) p0.MediaBrowserCompatItemReceiver())) {
            str = "pearl_image";
        } else {
            str = "pearl";
        }
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String strAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        p0.MediaDescriptionCompat();
        p0.AudioAttributesImplBaseParcelizer();
        dispatchTouchEvent.IconCompatParcelizer(contextRequireContext, strAudioAttributesCompatParcelizer, str, new MediaBrowserCompatCustomActionResultReceiver(), 80);
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends HlsPlaylist<String> {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void IconCompatParcelizer(String str) {
            if (str != null) {
                areModulesAlreadyInstalled.this.read().AudioAttributesCompatParcelizer(new LoggingConstants.MediaBrowserCompatItemReceiver(str));
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        read().AudioAttributesCompatParcelizer(LoggingConstants.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        concatByteArrays.Companion companion = concatByteArrays.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(concatByteArrays.Companion.RemoteActionCompatParcelizer(contextRequireContext, new mapOf(p0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk = null;
        }
        String string = hlsChunkSourceEncryptionKeyChunk.MediaBrowserCompatItemReceiver.getTag().toString();
        if (string.length() > 0) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(contextRequireContext, string, "pearl_display_id");
            areModulesAlreadyInstalled aremodulesalreadyinstalled = this;
            String string2 = getString(R.string.toast_mcq_copied);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(aremodulesalreadyinstalled, string2, 0);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk2 = null;
        if (hlsChunkSourceEncryptionKeyChunk == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk = null;
        }
        hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.performHapticFeedback(1);
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk3 = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceEncryptionKeyChunk2 = hlsChunkSourceEncryptionKeyChunk3;
        }
        hlsChunkSourceEncryptionKeyChunk2.write.performHapticFeedback(1);
        read().AudioAttributesCompatParcelizer(LoggingConstants.read.INSTANCE);
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver() {
        int[] iArr = new int[2];
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk2 = null;
        if (hlsChunkSourceEncryptionKeyChunk == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk = null;
        }
        hlsChunkSourceEncryptionKeyChunk.RemoteActionCompatParcelizer.getLocationInWindow(iArr);
        int i = iArr[0];
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk3 = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk3 = null;
        }
        int width = i - (hlsChunkSourceEncryptionKeyChunk3.RemoteActionCompatParcelizer.getWidth() / 2);
        int i2 = iArr[1];
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk4 = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk4 = null;
        }
        int height = i2 - hlsChunkSourceEncryptionKeyChunk4.RemoteActionCompatParcelizer.getHeight();
        StringBuilder sb = new StringBuilder("x");
        sb.append(width);
        sb.append(", y");
        sb.append(height);
        buildResolutionString.IconCompatParcelizer("bookmark position", sb.toString());
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        new BookmarkPopupWindow(contextRequireContext, new getAnswerMap() { // from class: o.FavaDiagnosticsEntity
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return areModulesAlreadyInstalled.AudioAttributesCompatParcelizer(this.write, ((Integer) obj).intValue());
            }
        }).write(width, height);
        getLatestBitrateEstimate.write("Pearl_details_bookmark_popup", null);
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk5 = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk5 = null;
        }
        hlsChunkSourceEncryptionKeyChunk5.AudioAttributesImplBaseParcelizer.performHapticFeedback(1);
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk6 = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            hlsChunkSourceEncryptionKeyChunk2 = hlsChunkSourceEncryptionKeyChunk6;
        }
        hlsChunkSourceEncryptionKeyChunk2.write.performHapticFeedback(1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(areModulesAlreadyInstalled aremodulesalreadyinstalled, int i) {
        aremodulesalreadyinstalled.read().AudioAttributesCompatParcelizer(new LoggingConstants.AudioAttributesCompatParcelizer(i));
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatItemReceiver() {
        read().AudioAttributesCompatParcelizer(LoggingConstants.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0, String p1) {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String strAudioAttributesCompatParcelizer = DefaultTimeBarExternalSyntheticLambda0.AudioAttributesCompatParcelizer(contextRequireContext, R.array.app_name_f_text_share_pearl_to_be_filled, p0, p1);
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        scheduleUpdate.write(contextRequireContext2, "", strAudioAttributesCompatParcelizer);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        read().AudioAttributesCompatParcelizer(LoggingConstants.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        signOut.Companion companion = signOut.INSTANCE;
        String string = getString(R.string.feedback_dialog_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.feedback_dialog_message);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.text_feedback_dlg_pearl_hint);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.submit);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        signOut signoutAudioAttributesCompatParcelizer = signOut.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4);
        this.write = signoutAudioAttributesCompatParcelizer;
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        SignInCredential.read(signoutAudioAttributesCompatParcelizer, childFragmentManager, new getAnswerMap() { // from class: o.ModuleInstallResponse
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return areModulesAlreadyInstalled.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj);
            }
        }, new getCreatedOnDateMs() { // from class: o.fromModuleInstallRequest
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return areModulesAlreadyInstalled.onPrepare(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(areModulesAlreadyInstalled aremodulesalreadyinstalled, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        aremodulesalreadyinstalled.read().AudioAttributesCompatParcelizer(new LoggingConstants.write(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(areModulesAlreadyInstalled aremodulesalreadyinstalled) {
        areModulesAlreadyInstalled aremodulesalreadyinstalled2 = aremodulesalreadyinstalled;
        String string = aremodulesalreadyinstalled.requireContext().getString(R.string.text_enter_valuable_feedback);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(aremodulesalreadyinstalled2, string, 0);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        getPublicKeyCredential.Companion companion = getPublicKeyCredential.INSTANCE;
        String string = getString(R.string.btn_ok);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getPublicKeyCredential.Companion.IconCompatParcelizer("", p0, string, true).show(getChildFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(int p0) {
        boolean z = p0 > 0;
        HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
        if (hlsChunkSourceEncryptionKeyChunk == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            hlsChunkSourceEncryptionKeyChunk = null;
        }
        hlsChunkSourceEncryptionKeyChunk.write.setSelected(z);
        hlsChunkSourceEncryptionKeyChunk.write.setTag(R.id.ivBookmarkIcon, Integer.valueOf(p0));
        ImageView imageView = hlsChunkSourceEncryptionKeyChunk.write;
        bytesToStringUppercase bytestostringuppercase = bytesToStringUppercase.INSTANCE;
        imageView.setImageResource(bytesToStringUppercase.IconCompatParcelizer(p0));
        if (z) {
            hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.setText(getString(R.string.bookmarked_string));
        } else {
            hlsChunkSourceEncryptionKeyChunk.AudioAttributesImplBaseParcelizer.setText(getString(R.string.bookmark_string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(boolean p0) {
        if (p0) {
            signOut signout = this.write;
            if (signout != null) {
                signout.dismiss();
            }
            this.write = null;
            getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
            String string = getString(R.string.thank_you);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = getString(R.string.text_feedback_dlg_body_revamp);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            String string3 = getString(R.string.btn_okay);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, "", 0, null, true, false, null, 432).show(getChildFragmentManager(), "");
        }
    }

    private final void MediaDescriptionCompat() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            HlsChunkSourceEncryptionKeyChunk hlsChunkSourceEncryptionKeyChunk = this.IconCompatParcelizer;
            if (hlsChunkSourceEncryptionKeyChunk == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                hlsChunkSourceEncryptionKeyChunk = null;
            }
            LinearLayout linearLayout = hlsChunkSourceEncryptionKeyChunk.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    /* JADX INFO: renamed from: o.areModulesAlreadyInstalled$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/areModulesAlreadyInstalled$write;", "", "<init>", "()V", "Lo/ConnectionTracker;", "p0", "Landroidx/fragment/app/Fragment;", "write", "(Lo/ConnectionTracker;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment write(ConnectionTracker p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            areModulesAlreadyInstalled aremodulesalreadyinstalled = new areModulesAlreadyInstalled();
            aremodulesalreadyinstalled.setArguments(p0.write());
            return aremodulesalreadyinstalled;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
