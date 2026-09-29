###### Class com.airbnb.lottie.LottieAnimationView (com.airbnb.lottie.LottieAnimationView)
.class public Lcom/airbnb/lottie/LottieAnimationView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/LottieAnimationView$SavedState;,
        Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;,
        Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;,
        Lcom/airbnb/lottie/LottieAnimationView$read;
    }
.end annotation


# static fields
.field private static final write:Lo/onAudioEnabled;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/onAudioEnabled<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Lo/onAudioEnabled;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/onAudioEnabled<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private IconCompatParcelizer:Z

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/onAudioEnabled<",
            "Lo/ExoPlayerImplExternalSyntheticLambda19;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatItemReceiver:Lo/onCues;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/onCues<",
            "Lo/ExoPlayerImplExternalSyntheticLambda19;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaDescriptionCompat:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lo/onAudioUnderrun;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

.field private final RatingCompat:Lo/onAudioEnabled;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/onAudioEnabled<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private RemoteActionCompatParcelizer:Z

.field private read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 68
    new-instance v0, Lo/ExoPlayerImplExternalSyntheticLambda17;

    invoke-direct {v0}, Lo/ExoPlayerImplExternalSyntheticLambda17;-><init>()V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView;->write:Lo/onAudioEnabled;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 144
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 77
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$read;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$read;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;

    .line 96
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RatingCompat:Lo/onAudioEnabled;

    const/4 p1, 0x0

    .line 121
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer:I

    .line 123
    new-instance v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-direct {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    .line 131
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    .line 133
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    const/4 p1, 0x1

    .line 134
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    .line 138
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    .line 139
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaDescriptionCompat:Ljava/util/Set;

    const/4 p1, 0x0

    .line 145
    sget v0, Lo/onSkipSilenceEnabledChanged$AudioAttributesCompatParcelizer;->lottieAnimationViewStyle:I

    invoke-direct {p0, p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 149
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 77
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$read;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$read;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;

    .line 96
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RatingCompat:Lo/onAudioEnabled;

    const/4 p1, 0x0

    .line 121
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer:I

    .line 123
    new-instance v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-direct {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    .line 131
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    .line 133
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    const/4 p1, 0x1

    .line 134
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    .line 138
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    .line 139
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaDescriptionCompat:Ljava/util/Set;

    .line 150
    sget p1, Lo/onSkipSilenceEnabledChanged$AudioAttributesCompatParcelizer;->lottieAnimationViewStyle:I

    invoke-direct {p0, p2, p1}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    .line 154
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 77
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$read;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$read;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;

    .line 96
    new-instance p1, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RatingCompat:Lo/onAudioEnabled;

    const/4 p1, 0x0

    .line 121
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer:I

    .line 123
    new-instance v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-direct {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    .line 131
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    .line 133
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    const/4 p1, 0x1

    .line 134
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    .line 138
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    .line 139
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaDescriptionCompat:Ljava/util/Set;

    .line 155
    invoke-direct {p0, p2, p3}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 1

    .line 1169
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/maybeTriggerPendingMessages;Ljava/lang/Object;Lo/setDrmInitData;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/maybeTriggerPendingMessages;",
            "TT;",
            "Lo/setDrmInitData<",
            "TT;>;)V"
        }
    .end annotation

    .line 1091
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1, p2, p3}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer(Lo/maybeTriggerPendingMessages;Ljava/lang/Object;Lo/setDrmInitData;)V

    return-void
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 1117
    iput-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    .line 1118
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onCustomAction()V

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()Z
    .registers 1

    .line 948
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaDescriptionCompat()Z

    move-result p0

    return p0
.end method

.method static synthetic IconCompatParcelizer()Lo/onAudioEnabled;
    .registers 1

    .line 65
    sget-object v0, Lcom/airbnb/lottie/LottieAnimationView;->write:Lo/onAudioEnabled;

    return-object v0
.end method

.method private IconCompatParcelizer(FZ)V
    .registers 4

    if-eqz p2, :cond_9

    .line 1145
    iget-object p2, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1147
    :cond_9
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplBaseParcelizer(F)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/util/AttributeSet;I)V
    .registers 8

    .line 159
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 160
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_cacheComposition:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    .line 161
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_rawRes:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    .line 162
    sget v1, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_fileName:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    .line 163
    sget v3, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_url:I

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz p2, :cond_33

    if-nez v1, :cond_2b

    goto :goto_33

    .line 165
    :cond_2b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_33
    :goto_33
    if-eqz p2, :cond_41

    .line 168
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_rawRes:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_5c

    .line 170
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    goto :goto_5c

    :cond_41
    if-eqz v1, :cond_4f

    .line 173
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_fileName:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5c

    .line 175
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    goto :goto_5c

    :cond_4f
    if-eqz v3, :cond_5c

    .line 178
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_url:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5c

    .line 180
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    .line 184
    :cond_5c
    :goto_5c
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_fallbackRes:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setFallbackResource(I)V

    .line 185
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_autoPlay:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_6f

    .line 186
    iput-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    .line 189
    :cond_6f
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_loop:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    const/4 v1, -0x1

    if-eqz p2, :cond_7d

    .line 190
    iget-object p2, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p2, v1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi26Parcelizer(I)V

    .line 193
    :cond_7d
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_repeatMode:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_8e

    .line 194
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_repeatMode:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatMode(I)V

    .line 198
    :cond_8e
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_repeatCount:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_9f

    .line 199
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_repeatCount:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    .line 203
    :cond_9f
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_speed:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_b2

    .line 204
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_speed:I

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setSpeed(F)V

    .line 207
    :cond_b2
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_clipToCompositionBounds:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_c3

    .line 208
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_clipToCompositionBounds:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setClipToCompositionBounds(Z)V

    .line 211
    :cond_c3
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_clipTextToBoundingBox:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_d4

    .line 212
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_clipTextToBoundingBox:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setClipTextToBoundingBox(Z)V

    .line 215
    :cond_d4
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_defaultFontFileExtension:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_e5

    .line 216
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_defaultFontFileExtension:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setDefaultFontFileExtension(Ljava/lang/String;)V

    .line 219
    :cond_e5
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_imageAssetsFolder:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setImageAssetsFolder(Ljava/lang/String;)V

    .line 221
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_progress:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    .line 222
    sget v3, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_progress:I

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-direct {p0, v3, p2}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(FZ)V

    .line 224
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->read(Z)V

    .line 226
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_applyOpacityToLayers:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setApplyingOpacityToLayersEnabled(Z)V

    .line 228
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_applyShadowToLayers:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setApplyingShadowToLayersEnabled(Z)V

    .line 231
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_colorFilter:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_14d

    .line 232
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_colorFilter:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 233
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lo/getDefaultViewModelCreationExtras;->IconCompatParcelizer(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 234
    new-instance v0, Lo/onSurfaceTextureSizeChanged;

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    invoke-direct {v0, p2}, Lo/onSurfaceTextureSizeChanged;-><init>(I)V

    .line 235
    const-string p2, "**"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lo/maybeTriggerPendingMessages;

    invoke-direct {v1, p2}, Lo/maybeTriggerPendingMessages;-><init>([Ljava/lang/String;)V

    .line 236
    new-instance p2, Lo/setDrmInitData;

    invoke-direct {p2, v0}, Lo/setDrmInitData;-><init>(Ljava/lang/Object;)V

    .line 237
    sget-object v0, Lo/onAudioPositionAdvancing;->RemoteActionCompatParcelizer:Landroid/graphics/ColorFilter;

    invoke-direct {p0, v1, v0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer(Lo/maybeTriggerPendingMessages;Ljava/lang/Object;Lo/setDrmInitData;)V

    .line 240
    :cond_14d
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_renderMode:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_177

    .line 241
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_renderMode:I

    sget-object v0, Lo/onStreamTypeChanged;->read:Lo/onStreamTypeChanged;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 242
    invoke-static {}, Lo/onStreamTypeChanged;->values()[Lo/onStreamTypeChanged;

    move-result-object v0

    array-length v0, v0

    if-lt p2, v0, :cond_16e

    .line 243
    sget-object p2, Lo/onStreamTypeChanged;->read:Lo/onStreamTypeChanged;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    .line 245
    :cond_16e
    invoke-static {}, Lo/onStreamTypeChanged;->values()[Lo/onStreamTypeChanged;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setRenderMode(Lo/onStreamTypeChanged;)V

    .line 248
    :cond_177
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_asyncUpdates:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1a1

    .line 249
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_asyncUpdates:I

    sget-object v0, Lo/ExoPlayerImplExternalSyntheticLambda14;->IconCompatParcelizer:Lo/ExoPlayerImplExternalSyntheticLambda14;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 250
    invoke-static {}, Lo/onStreamTypeChanged;->values()[Lo/onStreamTypeChanged;

    move-result-object v0

    array-length v0, v0

    if-lt p2, v0, :cond_198

    .line 251
    sget-object p2, Lo/ExoPlayerImplExternalSyntheticLambda14;->IconCompatParcelizer:Lo/ExoPlayerImplExternalSyntheticLambda14;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    .line 253
    :cond_198
    invoke-static {}, Lo/ExoPlayerImplExternalSyntheticLambda14;->values()[Lo/ExoPlayerImplExternalSyntheticLambda14;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAsyncUpdates(Lo/ExoPlayerImplExternalSyntheticLambda14;)V

    .line 256
    :cond_1a1
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_ignoreDisabledSystemAnimations:I

    .line 257
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 256
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setIgnoreDisabledSystemAnimations(Z)V

    .line 263
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_useCompositionFrameRate:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1bb

    .line 264
    sget p2, Lo/onSkipSilenceEnabledChanged$write;->LottieAnimationView_lottie_useCompositionFrameRate:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setUseCompositionFrameRate(Z)V

    .line 267
    :cond_1bb
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private RemoteActionCompatParcelizer(I)Lo/onCues;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lo/onCues<",
            "Lo/ExoPlayerImplExternalSyntheticLambda19;",
            ">;"
        }
    .end annotation

    .line 494
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 495
    new-instance v0, Lo/onCues;

    new-instance v1, Lo/ExoPlayerImplExternalSyntheticLambda16;

    invoke-direct {v1, p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda16;-><init>(Lcom/airbnb/lottie/LottieAnimationView;I)V

    const/4 p0, 0x1

    invoke-direct {v0, v1, p0}, Lo/onCues;-><init>(Ljava/util/concurrent/Callable;Z)V

    return-object v0

    .line 498
    :cond_12
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_1f

    .line 499
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->IconCompatParcelizer(Landroid/content/Context;I)Lo/onCues;

    move-result-object p0

    return-object p0

    :cond_1f
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lo/ExoPlayerImplExternalSyntheticLambda21;->IconCompatParcelizer(Landroid/content/Context;ILjava/lang/String;)Lo/onCues;

    move-result-object p0

    return-object p0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 3

    .line 649
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatItemReceiver:Lo/onCues;

    if-eqz v0, :cond_10

    .line 650
    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;

    invoke-virtual {v0, v1}, Lo/onCues;->IconCompatParcelizer(Lo/onAudioEnabled;)Lo/onCues;

    .line 651
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatItemReceiver:Lo/onCues;

    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RatingCompat:Lo/onAudioEnabled;

    invoke-virtual {v0, p0}, Lo/onCues;->RemoteActionCompatParcelizer(Lo/onAudioEnabled;)Lo/onCues;

    :cond_10
    return-void
.end method

.method public static synthetic RemoteActionCompatParcelizer(Ljava/lang/Throwable;)V
    .registers 3

    .line 70
    invoke-static {p0}, Lo/setEncoderPadding;->write(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 71
    const-string v0, "Unable to load composition."

    invoke-static {v0, p0}, Lo/access3000;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 74
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to parse composition"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic read(Lcom/airbnb/lottie/LottieAnimationView;)I
    .registers 1

    .line 65
    iget p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer:I

    return p0
.end method

.method private read(Ljava/lang/String;)Lo/onCues;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo/onCues<",
            "Lo/ExoPlayerImplExternalSyntheticLambda19;",
            ">;"
        }
    .end annotation

    .line 510
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 511
    new-instance v0, Lo/onCues;

    new-instance v1, Lo/ExoPlayerImplExternalSyntheticLambda15;

    invoke-direct {v1, p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda15;-><init>(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-direct {v0, v1, p0}, Lo/onCues;-><init>(Ljava/util/concurrent/Callable;Z)V

    return-object v0

    .line 514
    :cond_12
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_1f

    .line 515
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->AudioAttributesCompatParcelizer(Landroid/content/Context;Ljava/lang/String;)Lo/onCues;

    move-result-object p0

    return-object p0

    :cond_1f
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lo/ExoPlayerImplExternalSyntheticLambda21;->IconCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/onCues;

    move-result-object p0

    return-object p0
.end method

.method private read()V
    .registers 3

    .line 1314
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    const/4 v1, 0x0

    .line 1317
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1318
    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v0, :cond_14

    .line 1321
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onPlayFromMediaId()V

    :cond_14
    return-void
.end method

.method static synthetic write(Lcom/airbnb/lottie/LottieAnimationView;)Lo/onAudioEnabled;
    .registers 1

    .line 65
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplBaseParcelizer:Lo/onAudioEnabled;

    return-object p0
.end method

.method private write(Lo/onCues;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/onCues<",
            "Lo/ExoPlayerImplExternalSyntheticLambda19;",
            ">;)V"
        }
    .end annotation

    .line 635
    invoke-virtual {p1}, Lo/onCues;->AudioAttributesCompatParcelizer()Lo/onDroppedFrames;

    move-result-object v0

    .line 636
    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-eqz v0, :cond_19

    .line 637
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v1, v2, :cond_19

    invoke-virtual {v1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer()Lo/ExoPlayerImplExternalSyntheticLambda19;

    move-result-object v1

    invoke-virtual {v0}, Lo/onDroppedFrames;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_19

    return-void

    .line 640
    :cond_19
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 641
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer()V

    .line 642
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer()V

    .line 643
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatCustomActionResultReceiver:Lo/onAudioEnabled;

    .line 644
    invoke-virtual {p1, v0}, Lo/onCues;->write(Lo/onAudioEnabled;)Lo/onCues;

    move-result-object p1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RatingCompat:Lo/onAudioEnabled;

    .line 645
    invoke-virtual {p1, v0}, Lo/onCues;->read(Lo/onAudioEnabled;)Lo/onCues;

    move-result-object p1

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatItemReceiver:Lo/onCues;

    return-void
.end method


# virtual methods
.method public final synthetic AudioAttributesCompatParcelizer(I)Lo/onDroppedFrames;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 495
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 496
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->AudioAttributesCompatParcelizer(Landroid/content/Context;I)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0

    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lo/ExoPlayerImplExternalSyntheticLambda21;->AudioAttributesCompatParcelizer(Landroid/content/Context;ILjava/lang/String;)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/animation/Animator$AnimatorListener;)V
    .registers 2

    .line 873
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->write(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public invalidate()V
    .registers 3

    .line 301
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->invalidate()V

    .line 302
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 303
    instance-of v1, v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-eqz v1, :cond_1a

    check-cast v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplBaseParcelizer()Lo/onStreamTypeChanged;

    move-result-object v0

    sget-object v1, Lo/onStreamTypeChanged;->RemoteActionCompatParcelizer:Lo/onStreamTypeChanged;

    if-ne v0, v1, :cond_1a

    .line 309
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1a
    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 314
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-ne v0, v1, :cond_c

    .line 317
    invoke-super {p0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 320
    :cond_c
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 2

    .line 371
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->onAttachedToWindow()V

    .line 372
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_12

    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_12

    .line 373
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onMediaButtonEvent()V

    :cond_12
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 4

    .line 338
    instance-of v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    if-nez v0, :cond_8

    .line 339
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 343
    :cond_8
    check-cast p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    .line 344
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 345
    iget-object v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->read:Ljava/lang/String;

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    .line 346
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2c

    .line 347
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    .line 349
    :cond_2c
    iget v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->RemoteActionCompatParcelizer:I

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    .line 350
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    iget v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    if-eqz v0, :cond_41

    .line 351
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    .line 353
    :cond_41
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_51

    .line 354
    iget v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->write:F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(FZ)V

    .line 356
    :cond_51
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_62

    iget-boolean v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->IconCompatParcelizer:Z

    if-eqz v0, :cond_62

    .line 357
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->write()V

    .line 359
    :cond_62
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->read:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_71

    .line 360
    iget-object v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setImageAssetsFolder(Ljava/lang/String;)V

    .line 362
    :cond_71
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_80

    .line 363
    iget v0, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatMode(I)V

    .line 365
    :cond_80
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8f

    .line 366
    iget p1, p1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    :cond_8f
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 325
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 326
    new-instance v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    invoke-direct {v1, v0}, Lcom/airbnb/lottie/LottieAnimationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 327
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    iput-object v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->read:Ljava/lang/String;

    .line 328
    iget v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    iput v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->RemoteActionCompatParcelizer:I

    .line 329
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatCustomActionResultReceiver()F

    move-result v0

    iput v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->write:F

    .line 330
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RatingCompat()Z

    move-result v0

    iput-boolean v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->IconCompatParcelizer:Z

    .line 331
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 332
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatItemReceiver()I

    move-result v0

    iput v0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesImplApi21Parcelizer:I

    .line 333
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi26Parcelizer()I

    move-result p0

    iput p0, v1, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    return-object v1
.end method

.method public final read(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .registers 2

    .line 861
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesCompatParcelizer(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public final read(Z)V
    .registers 3

    .line 412
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    sget-object v0, Lo/onAudioDecoderReleased;->AudioAttributesCompatParcelizer:Lo/onAudioDecoderReleased;

    invoke-virtual {p0, v0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(Lo/onAudioDecoderReleased;Z)V

    return-void
.end method

.method public setAnimation(I)V
    .registers 3

    .line 487
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    const/4 v0, 0x0

    .line 488
    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    .line 489
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer(I)Lo/onCues;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setAnimation(Ljava/io/InputStream;Ljava/lang/String;)V
    .registers 3

    .line 549
    invoke-static {p1, p2}, Lo/ExoPlayerImplExternalSyntheticLambda21;->RemoteActionCompatParcelizer(Ljava/io/InputStream;Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setAnimation(Ljava/lang/String;)V
    .registers 3

    .line 504
    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    const/4 v0, 0x0

    .line 505
    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    .line 506
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->read(Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setAnimation(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)V
    .registers 3

    .line 562
    invoke-static {p1, p2}, Lo/ExoPlayerImplExternalSyntheticLambda21;->read(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setAnimationFromJson(Ljava/lang/String;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 524
    invoke-virtual {p0, p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromJson(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAnimationFromJson(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 533
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p0, v0, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/io/InputStream;Ljava/lang/String;)V

    return-void
.end method

.method public setAnimationFromUrl(Ljava/lang/String;)V
    .registers 4

    .line 580
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 581
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->IconCompatParcelizer(Landroid/content/Context;Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    goto :goto_16

    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->AudioAttributesCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    .line 582
    :goto_16
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setAnimationFromUrl(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 600
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/ExoPlayerImplExternalSyntheticLambda21;->AudioAttributesCompatParcelizer(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/onCues;

    move-result-object p1

    .line 601
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lo/onCues;)V

    return-void
.end method

.method public setApplyingOpacityToLayersEnabled(Z)V
    .registers 2

    .line 1252
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(Z)V

    return-void
.end method

.method public setApplyingShadowToLayersEnabled(Z)V
    .registers 2

    .line 1270
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->write(Z)V

    return-void
.end method

.method public setAsyncUpdates(Lo/ExoPlayerImplExternalSyntheticLambda14;)V
    .registers 2

    .line 1236
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesCompatParcelizer(Lo/ExoPlayerImplExternalSyntheticLambda14;)V

    return-void
.end method

.method public setCacheComposition(Z)V
    .registers 2

    .line 469
    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    return-void
.end method

.method public setClipTextToBoundingBox(Z)V
    .registers 2

    .line 1285
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->IconCompatParcelizer(Z)V

    return-void
.end method

.method public setClipToCompositionBounds(Z)V
    .registers 2

    .line 448
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method public setComposition(Lo/ExoPlayerImplExternalSyntheticLambda19;)V
    .registers 4

    .line 661
    sget-boolean v0, Lo/ExoPlayerImplExternalSyntheticLambda18;->IconCompatParcelizer:Z

    .line 664
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v0, 0x1

    .line 666
    iput-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    .line 667
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->write(Lo/ExoPlayerImplExternalSyntheticLambda19;)Z

    move-result p1

    .line 668
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_19

    .line 669
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onMediaButtonEvent()V

    :cond_19
    const/4 v0, 0x0

    .line 671
    iput-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    .line 672
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-ne v0, v1, :cond_26

    if-eqz p1, :cond_48

    :cond_26
    if-nez p1, :cond_2b

    .line 678
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->read()V

    .line 684
    :cond_2b
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    invoke-virtual {p0, p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->onVisibilityChanged(Landroid/view/View;I)V

    .line 686
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 688
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaDescriptionCompat:Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_48

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/onAudioUnderrun;

    goto :goto_3b

    :cond_48
    return-void
.end method

.method public setDefaultFontFileExtension(Ljava/lang/String;)V
    .registers 2

    .line 1032
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatItemReceiver(Ljava/lang/String;)V

    return-void
.end method

.method public setFailureListener(Lo/onAudioEnabled;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/onAudioEnabled<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 619
    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplBaseParcelizer:Lo/onAudioEnabled;

    return-void
.end method

.method public setFallbackResource(I)V
    .registers 2

    .line 631
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method

.method public setFontAssetDelegate(Lo/ExoPlayerImplExternalSyntheticLambda10;)V
    .registers 2

    .line 1039
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(Lo/ExoPlayerImplExternalSyntheticLambda10;)V

    return-void
.end method

.method public setFontMap(Ljava/util/Map;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    .line 1054
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer(Ljava/util/Map;)V

    return-void
.end method

.method public setFrame(I)V
    .registers 2

    .line 1127
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->write(I)V

    return-void
.end method

.method public setIgnoreDisabledSystemAnimations(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 388
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer(Z)V

    return-void
.end method

.method public setImageAssetDelegate(Lo/ExoPlayerImplExternalSyntheticLambda12;)V
    .registers 2

    .line 1017
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer(Lo/ExoPlayerImplExternalSyntheticLambda12;)V

    return-void
.end method

.method public setImageAssetsFolder(Ljava/lang/String;)V
    .registers 2

    .line 966
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi21Parcelizer(Ljava/lang/String;)V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .registers 3

    const/4 v0, 0x0

    .line 285
    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    const/4 v0, 0x0

    .line 286
    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    .line 287
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer()V

    .line 288
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    const/4 v0, 0x0

    .line 278
    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    const/4 v0, 0x0

    .line 279
    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    .line 280
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer()V

    .line 281
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setImageResource(I)V
    .registers 3

    const/4 v0, 0x0

    .line 271
    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer:I

    const/4 v0, 0x0

    .line 272
    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->read:Ljava/lang/String;

    .line 273
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer()V

    .line 274
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-void
.end method

.method public setMaintainOriginalImageBounds(Z)V
    .registers 2

    .line 981
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatCustomActionResultReceiver(Z)V

    return-void
.end method

.method public setMaxFrame(I)V
    .registers 2

    .line 760
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(I)V

    return-void
.end method

.method public setMaxFrame(Ljava/lang/String;)V
    .registers 2

    .line 792
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplBaseParcelizer(Ljava/lang/String;)V

    return-void
.end method

.method public setMaxProgress(F)V
    .registers 2

    .line 774
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->IconCompatParcelizer(F)V

    return-void
.end method

.method public setMinAndMaxFrame(II)V
    .registers 3

    .line 822
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1, p2}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(II)V

    return-void
.end method

.method public setMinAndMaxFrame(Ljava/lang/String;)V
    .registers 2

    .line 802
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;)V

    return-void
.end method

.method public setMinAndMaxFrame(Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 4

    .line 814
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1, p2, p3}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public setMinAndMaxProgress(FF)V
    .registers 3

    .line 832
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1, p2}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesCompatParcelizer(FF)V

    return-void
.end method

.method public setMinFrame(I)V
    .registers 2

    .line 736
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatCustomActionResultReceiver(I)V

    return-void
.end method

.method public setMinFrame(Ljava/lang/String;)V
    .registers 2

    .line 783
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi26Parcelizer(Ljava/lang/String;)V

    return-void
.end method

.method public setMinProgress(F)V
    .registers 2

    .line 750
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->write(F)V

    return-void
.end method

.method public setOutlineMasksAndMattes(Z)V
    .registers 2

    .line 479
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi26Parcelizer(Z)V

    return-void
.end method

.method public setPerformanceTrackingEnabled(Z)V
    .registers 2

    .line 1160
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi21Parcelizer(Z)V

    return-void
.end method

.method public setProgress(F)V
    .registers 3

    const/4 v0, 0x1

    .line 1138
    invoke-direct {p0, p1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer(FZ)V

    return-void
.end method

.method public setRenderMode(Lo/onStreamTypeChanged;)V
    .registers 2

    .line 1204
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->read(Lo/onStreamTypeChanged;)V

    return-void
.end method

.method public setRepeatCount(I)V
    .registers 4

    .line 933
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 934
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplApi26Parcelizer(I)V

    return-void
.end method

.method public setRepeatMode(I)V
    .registers 4

    .line 910
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 911
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplBaseParcelizer(I)V

    return-void
.end method

.method public setSafeMode(Z)V
    .registers 2

    .line 1184
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->AudioAttributesImplBaseParcelizer(Z)V

    return-void
.end method

.method public setSpeed(F)V
    .registers 2

    .line 850
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatCustomActionResultReceiver(F)V

    return-void
.end method

.method public setTextDelegate(Lo/onVideoCodecError;)V
    .registers 2

    .line 1061
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->RemoteActionCompatParcelizer(Lo/onVideoCodecError;)V

    return-void
.end method

.method public setUseCompositionFrameRate(Z)V
    .registers 2

    .line 401
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaBrowserCompatItemReceiver(Z)V

    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 292
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_12

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-ne p1, v0, :cond_12

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaDescriptionCompat()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 293
    invoke-direct {p0}, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_26

    .line 294
    :cond_12
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_26

    instance-of v0, p1, Lo/ExoPlayerImplExternalSyntheticLambda6;

    if-eqz v0, :cond_26

    move-object v0, p1

    check-cast v0, Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->MediaDescriptionCompat()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 295
    invoke-virtual {v0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onCustomAction()V

    .line 297
    :cond_26
    :goto_26
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final synthetic write(Ljava/lang/String;)Lo/onDroppedFrames;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 511
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer:Z

    if-eqz v0, :cond_d

    .line 512
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, p1}, Lo/ExoPlayerImplExternalSyntheticLambda21;->read(Landroid/content/Context;Ljava/lang/String;)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0

    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lo/ExoPlayerImplExternalSyntheticLambda21;->read(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0
.end method

.method public final write()V
    .registers 3

    .line 718
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 719
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView;->MediaMetadataCompat:Lo/ExoPlayerImplExternalSyntheticLambda6;

    invoke-virtual {p0}, Lo/ExoPlayerImplExternalSyntheticLambda6;->onMediaButtonEvent()V

    return-void
.end method

###### Class com.airbnb.lottie.LottieAnimationView.AudioAttributesCompatParcelizer (com.airbnb.lottie.LottieAnimationView$AudioAttributesCompatParcelizer)
.class final enum Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/LottieAnimationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AudioAttributesCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field private static final synthetic AudioAttributesImplBaseParcelizer:[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field public static final enum IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field public static final enum MediaBrowserCompatCustomActionResultReceiver:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field public static final enum RemoteActionCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field public static final enum read:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

.field public static final enum write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1374
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "SET_ANIMATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1375
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "SET_PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1376
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "SET_REPEAT_MODE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1377
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "SET_REPEAT_COUNT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1378
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "SET_IMAGE_ASSETS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->read:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1379
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    const-string v1, "PLAY_OPTION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    .line 1373
    invoke-static {}, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write()[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    move-result-object v0

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1373
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;
    .registers 2

    .line 1373
    const-class v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    return-object p0
.end method

.method public static values()[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;
    .registers 1

    .line 1373
    sget-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, [Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    return-object v0
.end method

.method private static synthetic write()[Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;
    .registers 6

    .line 1373
    sget-object v0, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->write:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    sget-object v1, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    sget-object v2, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    sget-object v3, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    sget-object v4, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->read:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    sget-object v5, Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    filled-new-array/range {v0 .. v5}, [Lcom/airbnb/lottie/LottieAnimationView$AudioAttributesCompatParcelizer;

    move-result-object v0

    return-object v0
.end method

###### Class com.airbnb.lottie.LottieAnimationView.IconCompatParcelizer (com.airbnb.lottie.LottieAnimationView$IconCompatParcelizer)
.class final Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onAudioEnabled;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/LottieAnimationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/onAudioEnabled<",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/airbnb/lottie/LottieAnimationView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;)V
    .registers 3

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private read(Ljava/lang/Throwable;)V
    .registers 3

    .line 107
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p0, :cond_b

    return-void

    .line 112
    :cond_b
    invoke-static {p0}, Lcom/airbnb/lottie/LottieAnimationView;->read(Lcom/airbnb/lottie/LottieAnimationView;)I

    move-result v0

    if-eqz v0, :cond_18

    .line 113
    invoke-static {p0}, Lcom/airbnb/lottie/LottieAnimationView;->read(Lcom/airbnb/lottie/LottieAnimationView;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 115
    :cond_18
    invoke-static {p0}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lcom/airbnb/lottie/LottieAnimationView;)Lo/onAudioEnabled;

    move-result-object v0

    if-nez v0, :cond_23

    invoke-static {}, Lcom/airbnb/lottie/LottieAnimationView;->IconCompatParcelizer()Lo/onAudioEnabled;

    move-result-object p0

    goto :goto_27

    :cond_23
    invoke-static {p0}, Lcom/airbnb/lottie/LottieAnimationView;->write(Lcom/airbnb/lottie/LottieAnimationView;)Lo/onAudioEnabled;

    move-result-object p0

    .line 116
    :goto_27
    invoke-interface {p0, p1}, Lo/onAudioEnabled;->onResult(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final synthetic onResult(Ljava/lang/Object;)V
    .registers 2

    .line 98
    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView$IconCompatParcelizer;->read(Ljava/lang/Throwable;)V

    return-void
.end method

###### Class com.airbnb.lottie.LottieAnimationView.SavedState (com.airbnb.lottie.LottieAnimationView$SavedState)
.class Lcom/airbnb/lottie/LottieAnimationView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/LottieAnimationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/airbnb/lottie/LottieAnimationView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/lang/String;

.field AudioAttributesImplApi21Parcelizer:I

.field IconCompatParcelizer:Z

.field MediaBrowserCompatCustomActionResultReceiver:I

.field RemoteActionCompatParcelizer:I

.field read:Ljava/lang/String;

.field write:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1359
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$SavedState$5;

    invoke-direct {v0}, Lcom/airbnb/lottie/LottieAnimationView$SavedState$5;-><init>()V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 1339
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1340
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->read:Ljava/lang/String;

    .line 1341
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->write:F

    .line 1342
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_17

    const/4 v1, 0x0

    :cond_17
    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->IconCompatParcelizer:Z

    .line 1343
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 1344
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesImplApi21Parcelizer:I

    .line 1345
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 1325
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 1335
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 1350
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1351
    iget-object p2, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1352
    iget p2, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->write:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 1353
    iget-boolean p2, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->IconCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1354
    iget-object p2, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1355
    iget p2, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 1356
    iget p0, p0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class com.airbnb.lottie.LottieAnimationView.SavedState.AnonymousClass5 (com.airbnb.lottie.LottieAnimationView$SavedState$5)
.class final Lcom/airbnb/lottie/LottieAnimationView$SavedState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/LottieAnimationView$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/airbnb/lottie/LottieAnimationView$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read(I)[Lcom/airbnb/lottie/LottieAnimationView$SavedState;
    .registers 1

    .line 1368
    new-array p0, p0, [Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Lcom/airbnb/lottie/LottieAnimationView$SavedState;
    .registers 3

    .line 1363
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/airbnb/lottie/LottieAnimationView$SavedState;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 1360
    invoke-static {p1}, Lcom/airbnb/lottie/LottieAnimationView$SavedState$5;->write(Landroid/os/Parcel;)Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 1360
    invoke-static {p1}, Lcom/airbnb/lottie/LottieAnimationView$SavedState$5;->read(I)[Lcom/airbnb/lottie/LottieAnimationView$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.lottie.LottieAnimationView.read (com.airbnb.lottie.LottieAnimationView$read)
.class final Lcom/airbnb/lottie/LottieAnimationView$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onAudioEnabled;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/LottieAnimationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/onAudioEnabled<",
        "Lo/ExoPlayerImplExternalSyntheticLambda19;",
        ">;"
    }
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/airbnb/lottie/LottieAnimationView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;)V
    .registers 3

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/ExoPlayerImplExternalSyntheticLambda19;)V
    .registers 2

    .line 88
    iget-object p0, p0, Lcom/airbnb/lottie/LottieAnimationView$read;->IconCompatParcelizer:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/LottieAnimationView;

    if-nez p0, :cond_b

    return-void

    .line 92
    :cond_b
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setComposition(Lo/ExoPlayerImplExternalSyntheticLambda19;)V

    return-void
.end method


# virtual methods
.method public final synthetic onResult(Ljava/lang/Object;)V
    .registers 2

    .line 79
    check-cast p1, Lo/ExoPlayerImplExternalSyntheticLambda19;

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView$read;->AudioAttributesCompatParcelizer(Lo/ExoPlayerImplExternalSyntheticLambda19;)V

    return-void
.end method

###### Class kotlin.ExoPlayerImplExternalSyntheticLambda15 (o.ExoPlayerImplExternalSyntheticLambda15)
.class public final synthetic Lo/ExoPlayerImplExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private synthetic IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView;

.field private synthetic read:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ExoPlayerImplExternalSyntheticLambda15;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p0, Lo/ExoPlayerImplExternalSyntheticLambda15;->read:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .registers 2

    .line 0
    iget-object v0, p0, Lo/ExoPlayerImplExternalSyntheticLambda15;->IconCompatParcelizer:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object p0, p0, Lo/ExoPlayerImplExternalSyntheticLambda15;->read:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/LottieAnimationView;->write(Ljava/lang/String;)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.ExoPlayerImplExternalSyntheticLambda16 (o.ExoPlayerImplExternalSyntheticLambda16)
.class public final synthetic Lo/ExoPlayerImplExternalSyntheticLambda16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private synthetic read:Lcom/airbnb/lottie/LottieAnimationView;

.field private synthetic write:I


# direct methods
.method public synthetic constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;I)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ExoPlayerImplExternalSyntheticLambda16;->read:Lcom/airbnb/lottie/LottieAnimationView;

    iput p2, p0, Lo/ExoPlayerImplExternalSyntheticLambda16;->write:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .registers 2

    .line 0
    iget-object v0, p0, Lo/ExoPlayerImplExternalSyntheticLambda16;->read:Lcom/airbnb/lottie/LottieAnimationView;

    iget p0, p0, Lo/ExoPlayerImplExternalSyntheticLambda16;->write:I

    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/LottieAnimationView;->AudioAttributesCompatParcelizer(I)Lo/onDroppedFrames;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.ExoPlayerImplExternalSyntheticLambda17 (o.ExoPlayerImplExternalSyntheticLambda17)
.class public final synthetic Lo/ExoPlayerImplExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onAudioEnabled;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .registers 2

    .line 0
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lcom/airbnb/lottie/LottieAnimationView;->RemoteActionCompatParcelizer(Ljava/lang/Throwable;)V

    return-void
.end method
