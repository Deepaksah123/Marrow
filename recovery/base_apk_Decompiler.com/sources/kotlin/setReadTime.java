package kotlin;

import java.io.IOException;
import java.io.InputStream;
import kotlin.BookReference;
import kotlin.setNotesCount;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setReadTime<MessageType extends BookReference> implements getParentMcqId<MessageType> {
    private static isAnswerSkipped read(MessageType messagetype) {
        if (messagetype instanceof setNotesCount) {
            return setNotesCount.onSkipToNext();
        }
        return new isAnswerSkipped();
    }

    private static MessageType AudioAttributesCompatParcelizer(MessageType messagetype) throws LessonTabItem {
        if (messagetype == null || messagetype.MediaBrowserCompatCustomActionResultReceiver()) {
            return messagetype;
        }
        throw read(messagetype).AudioAttributesCompatParcelizer().write(messagetype);
    }

    static {
        setStepType.write();
    }

    private MessageType AudioAttributesImplApi21Parcelizer(InputStream inputStream, setStepType setsteptype) throws LessonTabItem {
        setSlidesCount setslidescountWrite = setSlidesCount.write(inputStream);
        MessageType messagetypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setslidescountWrite, setsteptype);
        try {
            setslidescountWrite.IconCompatParcelizer(0);
            return messagetypeRemoteActionCompatParcelizer;
        } catch (LessonTabItem e) {
            throw e.write(messagetypeRemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getParentMcqId
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public MessageType AudioAttributesCompatParcelizer(InputStream inputStream, setStepType setsteptype) throws LessonTabItem {
        return (MessageType) AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer(inputStream, setsteptype));
    }

    private MessageType read(InputStream inputStream, setStepType setsteptype) throws LessonTabItem {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) AudioAttributesImplApi21Parcelizer(new setNotesCount.write.RemoteActionCompatParcelizer(inputStream, setSlidesCount.RemoteActionCompatParcelizer(i, inputStream)), setsteptype);
        } catch (IOException e) {
            throw new LessonTabItem(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getParentMcqId
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public MessageType RemoteActionCompatParcelizer(InputStream inputStream, setStepType setsteptype) throws LessonTabItem {
        return (MessageType) AudioAttributesCompatParcelizer(read(inputStream, setsteptype));
    }
}
