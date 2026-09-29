package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;
import kotlin.signalEndOfInput;

/* JADX INFO: loaded from: classes3.dex */
public final class signalEndOfInput extends RecyclerView.IconCompatParcelizer<read> {
    private final AudioAttributesCompatParcelizer IconCompatParcelizer;
    private List<? extends isStartTagIgnorePrefix> RemoteActionCompatParcelizer;

    /* JADX INFO: loaded from: classes.dex */
    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer(isStartTagIgnorePrefix isstarttagignoreprefix, int i);
    }

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[XmlPullParserUtil.values().length];
            try {
                iArr[XmlPullParserUtil.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[XmlPullParserUtil.read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            read = iArr;
        }
    }

    public signalEndOfInput(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return read(viewGroup);
    }

    public final void IconCompatParcelizer(List<? extends isStartTagIgnorePrefix> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        notifyDataSetChanged();
    }

    public class read extends RecyclerView.onMediaButtonEvent {
        private final ConstraintLayout AudioAttributesCompatParcelizer;
        private /* synthetic */ signalEndOfInput IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private final TextView RemoteActionCompatParcelizer;
        private final ImageView read;
        private final TextView write;

        /* JADX INFO: renamed from: o.signalEndOfInput$read$read, reason: collision with other inner class name */
        public static final /* synthetic */ class C0151read {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[XmlPullParserUtil.values().length];
                try {
                    iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[XmlPullParserUtil.write.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[XmlPullParserUtil.read.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                write = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(signalEndOfInput signalendofinput, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.IconCompatParcelizer = signalendofinput;
            View viewFindViewById = view.findViewById(R.id.clMain);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.AudioAttributesCompatParcelizer = (ConstraintLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.ivIcon);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.read = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.MediaBrowserCompatCustomActionResultReceiver = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tvSubTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.RemoteActionCompatParcelizer = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.tvExtra);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.write = (TextView) viewFindViewById5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(signalEndOfInput signalendofinput, isStartTagIgnorePrefix isstarttagignoreprefix, int i) {
            signalendofinput.RemoteActionCompatParcelizer().IconCompatParcelizer(isstarttagignoreprefix, i);
        }

        public final void read(final isStartTagIgnorePrefix isstarttagignoreprefix, final int i) {
            int mediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.write(isstarttagignoreprefix, "");
            ConstraintLayout constraintLayout = this.AudioAttributesCompatParcelizer;
            final signalEndOfInput signalendofinput = this.IconCompatParcelizer;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.VideoFrameProcessorFactory
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    signalEndOfInput.read.read(signalendofinput, isstarttagignoreprefix, i);
                }
            });
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this.itemView.getContext()).IconCompatParcelizer(Integer.valueOf(signalEndOfInput.IconCompatParcelizer(isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer()))).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).RemoteActionCompatParcelizer(this.read);
            this.MediaBrowserCompatCustomActionResultReceiver.setText(isstarttagignoreprefix.MediaBrowserCompatItemReceiver());
            switch (C0151read.write[isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.RemoteActionCompatParcelizer.setText(isstarttagignoreprefix.AudioAttributesImplBaseParcelizer());
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.write);
                    if (isstarttagignoreprefix instanceof buildNalUnitForChild) {
                        mediaBrowserCompatItemReceiver = ((buildNalUnitForChild) isstarttagignoreprefix).IconCompatParcelizer();
                    } else {
                        if (isstarttagignoreprefix instanceof ColorInfo) {
                            mediaBrowserCompatItemReceiver = ((ColorInfo) isstarttagignoreprefix).getMediaBrowserCompatItemReceiver();
                        }
                        this.MediaBrowserCompatCustomActionResultReceiver.setText(isstarttagignoreprefix.MediaBrowserCompatItemReceiver());
                        return;
                    }
                    if (mediaBrowserCompatItemReceiver > 0) {
                        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, isstarttagignoreprefix.MediaBrowserCompatItemReceiver());
                        return;
                    }
                    this.MediaBrowserCompatCustomActionResultReceiver.setText(isstarttagignoreprefix.MediaBrowserCompatItemReceiver());
                    return;
                case 9:
                case 10:
                case 11:
                    if (isstarttagignoreprefix instanceof VideoFrameProcessorInputType) {
                        CharSequence text = this.itemView.getContext().getText(R.string.label_id_pre);
                        VideoFrameProcessorInputType videoFrameProcessorInputType = (VideoFrameProcessorInputType) isstarttagignoreprefix;
                        String remoteActionCompatParcelizer = videoFrameProcessorInputType.getRemoteActionCompatParcelizer();
                        CharSequence text2 = this.itemView.getContext().getText(isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer() == XmlPullParserUtil.read ? R.string.tag_bs_pearlId : R.string.tag_bs_mcqId);
                        String audioAttributesCompatParcelizer = videoFrameProcessorInputType.getAudioAttributesCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) text);
                        sb.append(" ");
                        sb.append(remoteActionCompatParcelizer);
                        sb.append(" • ");
                        sb.append((Object) text2);
                        sb.append(" ");
                        sb.append(audioAttributesCompatParcelizer);
                        this.write.setText(sb.toString());
                        bytesRead.AudioAttributesImplApi21Parcelizer(this.write);
                        this.RemoteActionCompatParcelizer.setText(videoFrameProcessorInputType.getAudioAttributesImplBaseParcelizer());
                        return;
                    }
                    return;
                default:
                    throw new RenewEligibleCreator();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(XmlPullParserUtil xmlPullParserUtil) {
        switch (write.read[xmlPullParserUtil.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return R.drawable.icv_bs_qbank;
            case 4:
            case 5:
            case 6:
                return R.drawable.icv_bs_practical_corner;
            case 7:
            case 8:
                return R.drawable.icv_bs_pearl;
            case 9:
                return R.drawable.icv_bs_test;
            case 10:
                return R.drawable.icv_bs_video;
            case 11:
                return R.drawable.icv_bs_video_timeline;
            default:
                throw new RenewEligibleCreator();
        }
    }

    private read read(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_better_search, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new read(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(read readVar, int i) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        readVar.read(this.RemoteActionCompatParcelizer.get(i), i);
    }
}
