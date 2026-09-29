package kotlin;

import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import kotlin.buildFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class findRubyContainerNode {
    public static final boolean IconCompatParcelizer(OptionItem optionItem) {
        toMagicModuleMetaRepoModel.write(optionItem, "");
        return !(optionItem instanceof OptionItem.SubjectTextOptionItem);
    }

    public static final String read(OptionItem optionItem) {
        toMagicModuleMetaRepoModel.write(optionItem, "");
        if (optionItem instanceof OptionItem.ResolutionOptionItem) {
            buildFormat.Companion companion = buildFormat.INSTANCE;
            return buildFormat.Companion.IconCompatParcelizer(((OptionItem.ResolutionOptionItem) optionItem).getRead().getIconCompatParcelizer());
        }
        if (optionItem instanceof OptionItem.SeekOptionItem) {
            return ((OptionItem.SeekOptionItem) optionItem).getAudioAttributesCompatParcelizer();
        }
        if (optionItem instanceof OptionItem.PlaybackSpeedOptionItem) {
            return ((OptionItem.PlaybackSpeedOptionItem) optionItem).getIconCompatParcelizer();
        }
        if (!(optionItem instanceof OptionItem.SubjectTextOptionItem)) {
            throw new RenewEligibleCreator();
        }
        OptionItem.SubjectTextOptionItem subjectTextOptionItem = (OptionItem.SubjectTextOptionItem) optionItem;
        String iconCompatParcelizer = subjectTextOptionItem.getIconCompatParcelizer();
        int read = subjectTextOptionItem.getRead();
        StringBuilder sb = new StringBuilder();
        sb.append(iconCompatParcelizer);
        sb.append(" (");
        sb.append(read);
        sb.append(")");
        return sb.toString();
    }

    public static final boolean RemoteActionCompatParcelizer(OptionItem optionItem) {
        toMagicModuleMetaRepoModel.write(optionItem, "");
        return (optionItem instanceof OptionItem.ResolutionOptionItem) && ((OptionItem.ResolutionOptionItem) optionItem).getIconCompatParcelizer();
    }
}
