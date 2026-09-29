package kotlin;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.Tag;

/* JADX INFO: loaded from: classes4.dex */
public class getPlanType {
    private final boolean AudioAttributesCompatParcelizer;
    private Set<TaxPercentInfoCompanion> AudioAttributesImplApi21Parcelizer;
    private ArrayDeque<TaxPercentInfoCompanion> AudioAttributesImplApi26Parcelizer;
    private final getFilterText AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final isImagePearl MediaBrowserCompatItemReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private final setDoNotConsider read;
    private final boolean write;

    public enum IconCompatParcelizer {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    public getPlanType(boolean z, boolean z2, getFilterText getfiltertext, setDoNotConsider setdonotconsider, isImagePearl isimagepearl) {
        toMagicModuleMetaRepoModel.write(getfiltertext, "");
        toMagicModuleMetaRepoModel.write(setdonotconsider, "");
        toMagicModuleMetaRepoModel.write(isimagepearl, "");
        this.write = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer = getfiltertext;
        this.read = setdonotconsider;
        this.MediaBrowserCompatItemReceiver = isimagepearl;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getFilterText write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final Preference IconCompatParcelizer(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(preference);
    }

    public final Preference write(Preference preference) {
        toMagicModuleMetaRepoModel.write(preference, "");
        return this.read.IconCompatParcelizer(preference);
    }

    public static IconCompatParcelizer IconCompatParcelizer(TaxPercentInfoCompanion taxPercentInfoCompanion, getCgstPercentInfo getcgstpercentinfo) {
        toMagicModuleMetaRepoModel.write(taxPercentInfoCompanion, "");
        toMagicModuleMetaRepoModel.write(getcgstpercentinfo, "");
        return IconCompatParcelizer.CHECK_SUBTYPE_AND_LOWER;
    }

    public static boolean write(getAnswerMap<? super read, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        read.IconCompatParcelizer iconCompatParcelizer = new read.IconCompatParcelizer();
        getanswermap.invoke(iconCompatParcelizer);
        return iconCompatParcelizer.read();
    }

    public interface read {
        void read(getCreatedOnDateMs<Boolean> getcreatedondatems);

        public static final class IconCompatParcelizer implements read {
            private boolean read;

            public final boolean read() {
                return this.read;
            }

            @Override // o.getPlanType.read
            public final void read(getCreatedOnDateMs<Boolean> getcreatedondatems) {
                toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
                if (this.read) {
                    return;
                }
                this.read = getcreatedondatems.invoke().booleanValue();
            }
        }
    }

    public final ArrayDeque<TaxPercentInfoCompanion> RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Set<TaxPercentInfoCompanion> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new ArrayDeque<>(4);
        }
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            Tag.write writeVar = Tag.RemoteActionCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = Tag.write.AudioAttributesCompatParcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        ArrayDeque<TaxPercentInfoCompanion> arrayDeque = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(arrayDeque);
        arrayDeque.clear();
        Set<TaxPercentInfoCompanion> set = this.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.write(set);
        set.clear();
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    public static Boolean RemoteActionCompatParcelizer(Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        return null;
    }

    public boolean read(Preference preference, Preference preference2) {
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(preference2, "");
        return true;
    }

    public static abstract class AudioAttributesCompatParcelizer {
        public abstract TaxPercentInfoCompanion RemoteActionCompatParcelizer(getPlanType getplantype, Preference preference);

        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        public static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
            public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

            private IconCompatParcelizer() {
                super((byte) 0);
            }

            @Override // o.getPlanType.AudioAttributesCompatParcelizer
            public final /* synthetic */ TaxPercentInfoCompanion RemoteActionCompatParcelizer(getPlanType getplantype, Preference preference) {
                return (TaxPercentInfoCompanion) read(getplantype, preference);
            }

            private static Void read(getPlanType getplantype, Preference preference) {
                toMagicModuleMetaRepoModel.write(getplantype, "");
                toMagicModuleMetaRepoModel.write(preference, "");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
            public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
                super((byte) 0);
            }

            @Override // o.getPlanType.AudioAttributesCompatParcelizer
            public final TaxPercentInfoCompanion RemoteActionCompatParcelizer(getPlanType getplantype, Preference preference) {
                toMagicModuleMetaRepoModel.write(getplantype, "");
                toMagicModuleMetaRepoModel.write(preference, "");
                return getplantype.write().handleMediaPlayPauseIfPendingOnHandler(preference);
            }
        }

        public static final class write extends AudioAttributesCompatParcelizer {
            public static final write IconCompatParcelizer = new write();

            private write() {
                super((byte) 0);
            }

            @Override // o.getPlanType.AudioAttributesCompatParcelizer
            public final TaxPercentInfoCompanion RemoteActionCompatParcelizer(getPlanType getplantype, Preference preference) {
                toMagicModuleMetaRepoModel.write(getplantype, "");
                toMagicModuleMetaRepoModel.write(preference, "");
                return getplantype.write().onAddQueueItem(preference);
            }
        }

        public static abstract class read extends AudioAttributesCompatParcelizer {
            public read() {
                super((byte) 0);
            }
        }
    }
}
