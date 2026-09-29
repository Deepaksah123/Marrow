###### Class androidx.transition.Transition (androidx.transition.Transition)
.class public abstract Landroidx/transition/Transition;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Transition$write;,
        Landroidx/transition/Transition$AudioAttributesCompatParcelizer;,
        Landroidx/transition/Transition$read;,
        Landroidx/transition/Transition$IconCompatParcelizer;,
        Landroidx/transition/Transition$RemoteActionCompatParcelizer;,
        Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

.field private static final MediaBrowserCompatSearchResultReceiver:Landroidx/transition/PathMotion;

.field private static RatingCompat:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lo/setTitleOptional<",
            "Landroid/animation/Animator;",
            "Landroidx/transition/Transition$write;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final RemoteActionCompatParcelizer:[I


# instance fields
.field AudioAttributesCompatParcelizer:Z

.field AudioAttributesImplApi26Parcelizer:J

.field AudioAttributesImplBaseParcelizer:J

.field IconCompatParcelizer:J

.field MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

.field MediaBrowserCompatItemReceiver:Z

.field private MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/Rstring;",
            ">;"
        }
    .end annotation
.end field

.field private MediaDescriptionCompat:Landroidx/transition/Transition;

.field private MediaMetadataCompat:Lo/Rdrawable;

.field private handleMediaPlayPauseIfPendingOnHandler:Landroidx/transition/Transition$AudioAttributesCompatParcelizer;

.field private onAddQueueItem:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private onCommand:[Landroidx/transition/Transition$RemoteActionCompatParcelizer;

.field private onCustomAction:Landroid/animation/TimeInterpolator;

.field private onFastForward:I

.field private onMediaButtonEvent:Lo/setTitleOptional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/setTitleOptional<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private onPause:Landroidx/transition/PathMotion;

.field private onPlay:Ljava/lang/String;

.field private onPlayFromMediaId:[I

.field private onPlayFromSearch:Lo/Rcolor;

.field private onPlayFromUri:Lo/Rdrawable;

.field private onPrepare:Z

.field private onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

.field private onPrepareFromSearch:J

.field private onPrepareFromUri:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private onRemoveQueueItem:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private onRemoveQueueItemAt:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onRewind:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onSeekTo:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/Rstring;",
            ">;"
        }
    .end annotation
.end field

.field private onSetCaptioningEnabled:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private onSetPlaybackSpeed:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private onSetRating:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private onSetRepeatMode:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private onSetShuffleMode:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private onSkipToNext:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field read:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field private setSessionImpl:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field write:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x0

    .line 132
    new-array v0, v0, [Landroid/animation/Animator;

    sput-object v0, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 174
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Landroidx/transition/Transition;->RemoteActionCompatParcelizer:[I

    .line 181
    new-instance v0, Landroidx/transition/Transition$3;

    invoke-direct {v0}, Landroidx/transition/Transition$3;-><init>()V

    sput-object v0, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/PathMotion;

    .line 216
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/transition/Transition;->RatingCompat:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/transition/Transition;->onPlay:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 193
    iput-wide v0, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    .line 194
    iput-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    const/4 v0, 0x0

    .line 195
    iput-object v0, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    .line 196
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    .line 197
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    .line 198
    iput-object v0, p0, Landroidx/transition/Transition;->onSetPlaybackSpeed:Ljava/util/ArrayList;

    .line 199
    iput-object v0, p0, Landroidx/transition/Transition;->setSessionImpl:Ljava/util/ArrayList;

    .line 200
    iput-object v0, p0, Landroidx/transition/Transition;->onPrepareFromUri:Ljava/util/ArrayList;

    .line 201
    iput-object v0, p0, Landroidx/transition/Transition;->onRemoveQueueItemAt:Ljava/util/ArrayList;

    .line 202
    iput-object v0, p0, Landroidx/transition/Transition;->onSetShuffleMode:Ljava/util/ArrayList;

    .line 203
    iput-object v0, p0, Landroidx/transition/Transition;->onSetRepeatMode:Ljava/util/ArrayList;

    .line 204
    iput-object v0, p0, Landroidx/transition/Transition;->onRemoveQueueItem:Ljava/util/ArrayList;

    .line 205
    iput-object v0, p0, Landroidx/transition/Transition;->onRewind:Ljava/util/ArrayList;

    .line 206
    iput-object v0, p0, Landroidx/transition/Transition;->onSetRating:Ljava/util/ArrayList;

    .line 207
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    .line 208
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    .line 209
    iput-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    .line 210
    sget-object v1, Landroidx/transition/Transition;->RemoteActionCompatParcelizer:[I

    iput-object v1, p0, Landroidx/transition/Transition;->onPlayFromMediaId:[I

    const/4 v1, 0x0

    .line 225
    iput-boolean v1, p0, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer:Z

    .line 229
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    .line 232
    sget-object v2, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    .line 236
    iput v1, p0, Landroidx/transition/Transition;->onFastForward:I

    .line 239
    iput-boolean v1, p0, Landroidx/transition/Transition;->onPrepare:Z

    .line 243
    iput-boolean v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 246
    iput-object v0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    .line 249
    iput-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    .line 268
    sget-object v0, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/PathMotion;

    iput-object v0, p0, Landroidx/transition/Transition;->onPause:Landroidx/transition/PathMotion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/transition/Transition;->onPlay:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 193
    iput-wide v0, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    .line 194
    iput-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    const/4 v0, 0x0

    .line 195
    iput-object v0, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    .line 196
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    .line 197
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    .line 198
    iput-object v0, p0, Landroidx/transition/Transition;->onSetPlaybackSpeed:Ljava/util/ArrayList;

    .line 199
    iput-object v0, p0, Landroidx/transition/Transition;->setSessionImpl:Ljava/util/ArrayList;

    .line 200
    iput-object v0, p0, Landroidx/transition/Transition;->onPrepareFromUri:Ljava/util/ArrayList;

    .line 201
    iput-object v0, p0, Landroidx/transition/Transition;->onRemoveQueueItemAt:Ljava/util/ArrayList;

    .line 202
    iput-object v0, p0, Landroidx/transition/Transition;->onSetShuffleMode:Ljava/util/ArrayList;

    .line 203
    iput-object v0, p0, Landroidx/transition/Transition;->onSetRepeatMode:Ljava/util/ArrayList;

    .line 204
    iput-object v0, p0, Landroidx/transition/Transition;->onRemoveQueueItem:Ljava/util/ArrayList;

    .line 205
    iput-object v0, p0, Landroidx/transition/Transition;->onRewind:Ljava/util/ArrayList;

    .line 206
    iput-object v0, p0, Landroidx/transition/Transition;->onSetRating:Ljava/util/ArrayList;

    .line 207
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    .line 208
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    .line 209
    iput-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    .line 210
    sget-object v1, Landroidx/transition/Transition;->RemoteActionCompatParcelizer:[I

    iput-object v1, p0, Landroidx/transition/Transition;->onPlayFromMediaId:[I

    const/4 v1, 0x0

    .line 225
    iput-boolean v1, p0, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer:Z

    .line 229
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    .line 232
    sget-object v2, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    .line 236
    iput v1, p0, Landroidx/transition/Transition;->onFastForward:I

    .line 239
    iput-boolean v1, p0, Landroidx/transition/Transition;->onPrepare:Z

    .line 243
    iput-boolean v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 246
    iput-object v0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    .line 249
    iput-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    .line 268
    sget-object v0, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/PathMotion;

    iput-object v0, p0, Landroidx/transition/Transition;->onPause:Landroidx/transition/PathMotion;

    .line 301
    sget-object v0, Lo/recordRemarketingPing;->MediaBrowserCompatCustomActionResultReceiver:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 302
    check-cast p2, Landroid/content/res/XmlResourceParser;

    .line 303
    const-string v1, "duration"

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-static {v0, p2, v1, v2, v3}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-ltz v6, :cond_87

    .line 306
    invoke-virtual {p0, v1, v2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;

    .line 308
    :cond_87
    const-string v1, "startDelay"

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v3}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v1

    int-to-long v1, v1

    cmp-long v3, v1, v4

    if-lez v3, :cond_96

    .line 311
    invoke-virtual {p0, v1, v2}, Landroidx/transition/Transition;->read(J)Landroidx/transition/Transition;

    .line 313
    :cond_96
    const-string v1, "interpolator"

    invoke-static {v0, p2, v1}, Lo/_parseLongPrimitive;->IconCompatParcelizer(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_a5

    .line 316
    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/transition/Transition;->write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    .line 318
    :cond_a5
    const-string p1, "matchOrder"

    const/4 v1, 0x3

    invoke-static {v0, p2, p1, v1}, Lo/_parseLongPrimitive;->RemoteActionCompatParcelizer(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b5

    .line 321
    invoke-static {p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Ljava/lang/String;)[I

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/transition/Transition;->read([I)V

    .line 323
    :cond_b5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)Landroidx/transition/Transition;
    .registers 1

    .line 129
    iget-object p0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;)V"
        }
    .end annotation

    .line 588
    invoke-virtual {p1}, Lo/AppCompatCheckBox;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_39

    .line 589
    invoke-virtual {p1, v0}, Lo/AppCompatCheckBox;->write(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_36

    .line 590
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_36

    .line 591
    invoke-virtual {p2, v1}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/Rstring;

    if-eqz v1, :cond_36

    .line 592
    iget-object v2, v1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, v2}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_36

    .line 593
    invoke-virtual {p1, v0}, Lo/AppCompatCheckBox;->AudioAttributesCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/Rstring;

    .line 594
    iget-object v3, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 595
    iget-object v2, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_36
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_39
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 636
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_4a

    .line 638
    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_47

    .line 639
    invoke-virtual {p0, v2}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_47

    .line 640
    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_47

    .line 641
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_47

    .line 642
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/Rstring;

    .line 643
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/Rstring;

    if-eqz v4, :cond_47

    if-eqz v5, :cond_47

    .line 645
    iget-object v6, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 646
    iget-object v4, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 647
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_47
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_4a
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Lo/setPresenter;Lo/setPresenter;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setPresenter<",
            "Landroid/view/View;",
            ">;",
            "Lo/setPresenter<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 609
    invoke-virtual {p3}, Lo/setPresenter;->write()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_4a

    .line 611
    invoke-virtual {p3, v1}, Lo/setPresenter;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_47

    .line 612
    invoke-virtual {p0, v2}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_47

    .line 613
    invoke-virtual {p3, v1}, Lo/setPresenter;->AudioAttributesCompatParcelizer(I)J

    move-result-wide v3

    invoke-virtual {p4, v3, v4}, Lo/setPresenter;->IconCompatParcelizer(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_47

    .line 614
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_47

    .line 615
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/Rstring;

    .line 616
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/Rstring;

    if-eqz v4, :cond_47

    if-eqz v5, :cond_47

    .line 618
    iget-object v6, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 619
    iget-object v4, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 620
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_47
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_4a
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Lo/setTitleOptional;Lo/setTitleOptional;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Lo/setTitleOptional<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 663
    invoke-virtual {p3}, Lo/AppCompatCheckBox;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_4c

    .line 665
    invoke-virtual {p3, v1}, Lo/AppCompatCheckBox;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_49

    .line 666
    invoke-virtual {p0, v2}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_49

    .line 667
    invoke-virtual {p3, v1}, Lo/AppCompatCheckBox;->write(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p4, v3}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_49

    .line 668
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_49

    .line 669
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/Rstring;

    .line 670
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/Rstring;

    if-eqz v4, :cond_49

    if-eqz v5, :cond_49

    .line 672
    iget-object v6, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 673
    iget-object v4, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 674
    invoke-virtual {p1, v2}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    invoke-virtual {p2, v3}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_49
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_4c
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)Z
    .registers 2

    if-lez p0, :cond_7

    const/4 v0, 0x4

    if-gt p0, v0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method private static AudioAttributesCompatParcelizer(Ljava/lang/String;)[I
    .registers 7

    .line 328
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v1, ","

    invoke-direct {v0, p0, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p0

    new-array p0, p0, [I

    const/4 v1, 0x0

    move v2, v1

    .line 332
    :goto_f
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v3

    if-eqz v3, :cond_78

    .line 333
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 334
    const-string v4, "id"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2a

    const/4 v3, 0x3

    .line 335
    aput v3, p0, v2

    goto :goto_5d

    .line 336
    :cond_2a
    const-string v4, "instance"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_35

    .line 337
    aput v5, p0, v2

    goto :goto_5d

    .line 338
    :cond_35
    const-string v4, "name"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_41

    const/4 v3, 0x2

    .line 339
    aput v3, p0, v2

    goto :goto_5d

    .line 340
    :cond_41
    const-string v4, "itemId"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4d

    const/4 v3, 0x4

    .line 341
    aput v3, p0, v2

    goto :goto_5d

    .line 342
    :cond_4d
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5f

    .line 344
    array-length v3, p0

    sub-int/2addr v3, v5

    new-array v3, v3, [I

    .line 345
    invoke-static {p0, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v2, -0x1

    move-object p0, v3

    :goto_5d
    add-int/2addr v2, v5

    goto :goto_f

    .line 349
    :cond_5f
    new-instance p0, Landroid/view/InflateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown match type in matchOrder: \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_78
    return-object p0
.end method

.method private IconCompatParcelizer(Landroidx/transition/Transition;Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V
    .registers 8

    .line 2334
    iget-object v0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    if-eqz v0, :cond_7

    .line 2335
    invoke-direct {v0, p1, p2, p3}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroidx/transition/Transition;Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 2337
    :cond_7
    iget-object p3, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    if-eqz p3, :cond_37

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_37

    .line 2339
    iget-object p3, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    .line 2340
    iget-object v0, p0, Landroidx/transition/Transition;->onCommand:[Landroidx/transition/Transition$RemoteActionCompatParcelizer;

    if-nez v0, :cond_1d

    .line 2341
    new-array v0, p3, [Landroidx/transition/Transition$RemoteActionCompatParcelizer;

    :cond_1d
    const/4 v1, 0x0

    .line 2342
    iput-object v1, p0, Landroidx/transition/Transition;->onCommand:[Landroidx/transition/Transition$RemoteActionCompatParcelizer;

    .line 2343
    iget-object v2, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/transition/Transition$RemoteActionCompatParcelizer;

    const/4 v2, 0x0

    :goto_29
    if-ge v2, p3, :cond_35

    .line 2345
    aget-object v3, v0, v2

    invoke-interface {p2, v3, p1}, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V

    .line 2346
    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_29

    .line 2348
    :cond_35
    iput-object v0, p0, Landroidx/transition/Transition;->onCommand:[Landroidx/transition/Transition$RemoteActionCompatParcelizer;

    :cond_37
    return-void
.end method

.method private IconCompatParcelizer(Lo/Rdrawable;Lo/Rdrawable;)V
    .registers 8

    .line 709
    new-instance v0, Lo/setTitleOptional;

    iget-object v1, p1, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-direct {v0, v1}, Lo/setTitleOptional;-><init>(Lo/AppCompatCheckBox;)V

    .line 710
    new-instance v1, Lo/setTitleOptional;

    iget-object v2, p2, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-direct {v1, v2}, Lo/setTitleOptional;-><init>(Lo/AppCompatCheckBox;)V

    const/4 v2, 0x0

    .line 713
    :goto_f
    iget-object v3, p0, Landroidx/transition/Transition;->onPlayFromMediaId:[I

    array-length v4, v3

    if-ge v2, v4, :cond_40

    .line 714
    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3a

    const/4 v4, 0x2

    if-eq v3, v4, :cond_32

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2a

    const/4 v4, 0x4

    if-ne v3, v4, :cond_3d

    .line 727
    iget-object v3, p1, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    iget-object v4, p2, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Lo/setPresenter;Lo/setPresenter;)V

    goto :goto_3d

    .line 723
    :cond_2a
    iget-object v3, p1, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    iget-object v4, p2, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_3d

    .line 719
    :cond_32
    iget-object v3, p1, Lo/Rdrawable;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    iget-object v4, p2, Lo/Rdrawable;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-direct {p0, v0, v1, v3, v4}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;Lo/setTitleOptional;Lo/setTitleOptional;)V

    goto :goto_3d

    .line 716
    :cond_3a
    invoke-direct {p0, v0, v1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;)V

    :cond_3d
    :goto_3d
    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    .line 732
    :cond_40
    invoke-direct {p0, v0, v1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Lo/setTitleOptional;Lo/setTitleOptional;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;",
            "Lo/setTitleOptional<",
            "Landroid/view/View;",
            "Lo/Rstring;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 689
    :goto_2
    invoke-virtual {p1}, Lo/AppCompatCheckBox;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_24

    .line 690
    invoke-virtual {p1, v1}, Lo/AppCompatCheckBox;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/Rstring;

    .line 691
    iget-object v4, v2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, v4}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_21

    .line 692
    iget-object v4, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 693
    iget-object v2, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 698
    :cond_24
    :goto_24
    invoke-virtual {p2}, Lo/AppCompatCheckBox;->size()I

    move-result p1

    if-ge v0, p1, :cond_45

    .line 699
    invoke-virtual {p2, v0}, Lo/AppCompatCheckBox;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/Rstring;

    .line 700
    iget-object v1, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_42

    .line 701
    iget-object v1, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 702
    iget-object p1, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_42
    add-int/lit8 v0, v0, 0x1

    goto :goto_24

    :cond_45
    return-void
.end method

.method private static RemoteActionCompatParcelizer([II)Z
    .registers 6

    .line 573
    aget v0, p0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_4
    if-ge v2, p1, :cond_f

    .line 575
    aget v3, p0, v2

    if-ne v3, v0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_f
    return v1
.end method

.method private static onFastForward()Lo/setTitleOptional;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/setTitleOptional<",
            "Landroid/animation/Animator;",
            "Landroidx/transition/Transition$write;",
            ">;"
        }
    .end annotation

    .line 908
    sget-object v0, Landroidx/transition/Transition;->RatingCompat:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/setTitleOptional;

    if-nez v0, :cond_14

    .line 910
    new-instance v0, Lo/setTitleOptional;

    invoke-direct {v0}, Lo/setTitleOptional;-><init>()V

    .line 911
    sget-object v1, Landroidx/transition/Transition;->RatingCompat:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_14
    return-object v0
.end method

.method private onPlayFromMediaId()Ljava/lang/String;
    .registers 1

    .line 2319
    iget-object p0, p0, Landroidx/transition/Transition;->onPlay:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic read(Landroidx/transition/Transition;)Landroidx/transition/Transition;
    .registers 2

    const/4 v0, 0x0

    .line 129
    iput-object v0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    return-object v0
.end method

.method private read(Landroid/animation/Animator;)V
    .registers 6

    if-nez p1, :cond_6

    .line 1996
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver()V

    return-void

    .line 1998
    :cond_6
    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_17

    .line 1999
    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 2001
    :cond_17
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2b

    .line 2002
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 2004
    :cond_2b
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;

    move-result-object v0

    if-eqz v0, :cond_38

    .line 2005
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 2007
    :cond_38
    new-instance v0, Landroidx/transition/Transition$2;

    invoke-direct {v0, p0}, Landroidx/transition/Transition$2;-><init>(Landroidx/transition/Transition;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2014
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method private read(Landroid/view/View;Z)V
    .registers 5

    if-eqz p1, :cond_47

    .line 1681
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 1696
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_30

    .line 1697
    new-instance v0, Lo/Rstring;

    invoke-direct {v0, p1}, Lo/Rstring;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_18

    .line 1699
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->read(Lo/Rstring;)V

    goto :goto_1b

    .line 1701
    :cond_18
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 1703
    :goto_1b
    iget-object v1, v0, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1704
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->write(Lo/Rstring;)V

    if-eqz p2, :cond_2b

    .line 1706
    iget-object v1, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    invoke-static {v1, p1, v0}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    goto :goto_30

    .line 1708
    :cond_2b
    iget-object v1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    invoke-static {v1, p1, v0}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    .line 1711
    :cond_30
    :goto_30
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_47

    .line 1727
    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    .line 1728
    :goto_37
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_47

    .line 1729
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Landroidx/transition/Transition;->read(Landroid/view/View;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_37

    :cond_47
    return-void
.end method

.method private varargs read([I)V
    .registers 4

    if-eqz p1, :cond_33

    .line 552
    array-length v0, p1

    if-eqz v0, :cond_33

    const/4 v0, 0x0

    .line 555
    :goto_6
    array-length v1, p1

    if-ge v0, v1, :cond_2a

    .line 556
    aget v1, p1, v0

    .line 557
    invoke-static {v1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(I)Z

    move-result v1

    if-eqz v1, :cond_22

    .line 560
    invoke-static {p1, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer([II)Z

    move-result v1

    if-nez v1, :cond_1a

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 561
    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "matches contains a duplicate value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 558
    :cond_22
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "matches contains invalid value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 564
    :cond_2a
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Landroidx/transition/Transition;->onPlayFromMediaId:[I

    return-void

    .line 553
    :cond_33
    sget-object p1, Landroidx/transition/Transition;->RemoteActionCompatParcelizer:[I

    iput-object p1, p0, Landroidx/transition/Transition;->onPlayFromMediaId:[I

    return-void
.end method

.method private static read(Lo/Rstring;Lo/Rstring;Ljava/lang/String;)Z
    .registers 3

    .line 1963
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 1964
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_12

    if-nez p1, :cond_12

    const/4 p0, 0x0

    return p0

    :cond_12
    const/4 p2, 0x1

    if-eqz p0, :cond_1d

    if-eqz p1, :cond_1d

    .line 1974
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p2

    return p0

    :cond_1d
    return p2
.end method

.method private write(Landroid/animation/Animator;Lo/setTitleOptional;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "Lo/setTitleOptional<",
            "Landroid/animation/Animator;",
            "Landroidx/transition/Transition$write;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_d

    .line 946
    new-instance v0, Landroidx/transition/Transition$1;

    invoke-direct {v0, p0, p2}, Landroidx/transition/Transition$1;-><init>(Landroidx/transition/Transition;Lo/setTitleOptional;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 958
    invoke-direct {p0, p1}, Landroidx/transition/Transition;->read(Landroid/animation/Animator;)V

    :cond_d
    return-void
.end method

.method private static write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V
    .registers 6

    .line 1611
    iget-object v0, p0, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {v0, p1, p2}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1612
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1f

    .line 1614
    iget-object v1, p0, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_1a

    .line 1616
    iget-object v1, p0, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1f

    .line 1618
    :cond_1a
    iget-object v1, p0, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1621
    :cond_1f
    :goto_1f
    invoke-static {p1}, Lo/InvalidTypeIdException;->onMediaButtonEvent(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_38

    .line 1623
    iget-object v1, p0, Lo/Rdrawable;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v1, p2}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    .line 1625
    iget-object v1, p0, Lo/Rdrawable;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v1, p2, v0}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_38

    .line 1627
    :cond_33
    iget-object v1, p0, Lo/Rdrawable;->AudioAttributesCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v1, p2, p1}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1630
    :cond_38
    :goto_38
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_7d

    .line 1631
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    .line 1632
    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_7d

    .line 1633
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    .line 1634
    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v1

    .line 1635
    iget-object p2, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p2, v1, v2}, Lo/setPresenter;->write(J)I

    move-result p2

    if-ltz p2, :cond_74

    .line 1637
    iget-object p1, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p1, v1, v2}, Lo/setPresenter;->IconCompatParcelizer(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_7d

    const/4 p2, 0x0

    .line 1639
    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    .line 1640
    iget-object p0, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p0, v1, v2, v0}, Lo/setPresenter;->write(JLjava/lang/Object;)V

    return-void

    :cond_74
    const/4 p2, 0x1

    .line 1643
    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    .line 1644
    iget-object p0, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p0, v1, v2, p1}, Lo/setPresenter;->write(JLjava/lang/Object;)V

    :cond_7d
    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 3

    .line 1083
    iget-object v0, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;
    .registers 3

    .line 2131
    iget-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    if-eqz v0, :cond_1c

    .line 2134
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    if-eqz v0, :cond_11

    .line 2135
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    .line 2137
    :cond_11
    iget-object p1, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-nez p1, :cond_1c

    const/4 p1, 0x0

    .line 2138
    iput-object p1, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    :cond_1c
    return-object p0
.end method

.method public AudioAttributesCompatParcelizer()V
    .registers 5

    .line 2095
    iget-object v0, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 2096
    iget-object v1, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    .line 2097
    sget-object v2, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    :goto_14
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_21

    .line 2099
    aget-object v2, v1, v0

    const/4 v3, 0x0

    .line 2100
    aput-object v3, v1, v0

    .line 2101
    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    goto :goto_14

    .line 2103
    :cond_21
    iput-object v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    .line 2104
    sget-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)V
    .registers 13

    .line 1851
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    .line 1852
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    .line 1853
    iget-object v0, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object v1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    invoke-direct {p0, v0, v1}, Landroidx/transition/Transition;->IconCompatParcelizer(Lo/Rdrawable;Lo/Rdrawable;)V

    .line 1855
    invoke-static {}, Landroidx/transition/Transition;->onFastForward()Lo/setTitleOptional;

    move-result-object v0

    .line 1856
    invoke-virtual {v0}, Lo/AppCompatCheckBox;->size()I

    move-result v1

    .line 1857
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWindowId()Landroid/view/WindowId;

    move-result-object v2

    .line 1858
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_26
    :goto_26
    add-int/lit8 v1, v1, -0x1

    const/4 v4, 0x1

    if-ltz v1, :cond_a2

    .line 1860
    invoke-virtual {v0, v1}, Lo/AppCompatCheckBox;->write(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/animation/Animator;

    if-eqz v5, :cond_26

    .line 1862
    invoke-virtual {v0, v5}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/transition/Transition$write;

    if-eqz v6, :cond_26

    .line 1863
    iget-object v7, v6, Landroidx/transition/Transition$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-eqz v7, :cond_26

    iget-object v7, v6, Landroidx/transition/Transition$write;->AudioAttributesImplApi21Parcelizer:Landroid/view/WindowId;

    .line 1864
    invoke-virtual {v2, v7}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_26

    .line 1865
    iget-object v7, v6, Landroidx/transition/Transition$write;->write:Lo/Rstring;

    .line 1866
    iget-object v8, v6, Landroidx/transition/Transition$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    .line 1867
    invoke-virtual {p0, v8, v4}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v9

    .line 1868
    invoke-virtual {p0, v8, v4}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v4

    if-nez v9, :cond_61

    if-nez v4, :cond_61

    .line 1870
    iget-object v4, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object v4, v4, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {v4, v8}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/Rstring;

    :cond_61
    if-nez v9, :cond_65

    if-eqz v4, :cond_26

    .line 1872
    :cond_65
    iget-object v8, v6, Landroidx/transition/Transition$write;->IconCompatParcelizer:Landroidx/transition/Transition;

    .line 1873
    invoke-virtual {v8, v7, v4}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;Lo/Rstring;)Z

    move-result v4

    if-eqz v4, :cond_26

    .line 1875
    iget-object v4, v6, Landroidx/transition/Transition$write;->IconCompatParcelizer:Landroidx/transition/Transition;

    .line 1876
    invoke-virtual {v4}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object v6

    iget-object v6, v6, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    if-eqz v6, :cond_8e

    .line 1879
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 1880
    iget-object v6, v4, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 1881
    invoke-virtual {v0, v1}, Lo/AppCompatCheckBox;->AudioAttributesCompatParcelizer(I)Ljava/lang/Object;

    .line 1882
    iget-object v5, v4, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-nez v5, :cond_26

    .line 1883
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_26

    .line 1885
    :cond_8e
    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    move-result v4

    if-nez v4, :cond_9e

    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    move-result v4

    if-nez v4, :cond_9e

    .line 1894
    invoke-virtual {v0, v1}, Lo/AppCompatCheckBox;->AudioAttributesCompatParcelizer(I)Ljava/lang/Object;

    goto :goto_26

    .line 1889
    :cond_9e
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    goto :goto_26

    :cond_a2
    const/4 v0, 0x0

    move v1, v0

    .line 1902
    :goto_a4
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_c3

    .line 1903
    invoke-virtual {v3, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 1904
    sget-object v5, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v2, v5, v0}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 1905
    iget-boolean v5, v2, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    if-nez v5, :cond_c0

    .line 1906
    iput-boolean v4, v2, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 1907
    sget-object v5, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v2, v5, v0}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    :cond_c0
    add-int/lit8 v1, v1, 0x1

    goto :goto_a4

    .line 1912
    :cond_c3
    iget-object v7, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object v8, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object v9, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    iget-object v10, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    move-object v5, p0

    move-object v6, p1

    invoke-virtual/range {v5 .. v10}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rdrawable;Lo/Rdrawable;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1913
    iget-object p1, p0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    if-nez p1, :cond_d8

    .line 1914
    invoke-virtual {p0}, Landroidx/transition/Transition;->onMediaButtonEvent()V

    return-void

    .line 1915
    :cond_d8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p1, v0, :cond_eb

    .line 1916
    invoke-virtual {p0}, Landroidx/transition/Transition;->onPause()V

    .line 1917
    iget-object p1, p0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    .line 1918
    iget-object p0, p0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer()V

    :cond_eb
    return-void
.end method

.method AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rdrawable;Lo/Rdrawable;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lo/Rdrawable;",
            "Lo/Rdrawable;",
            "Ljava/util/ArrayList<",
            "Lo/Rstring;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lo/Rstring;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 751
    invoke-static {}, Landroidx/transition/Transition;->onFastForward()Lo/setTitleOptional;

    move-result-object v9

    .line 753
    new-instance v10, Landroid/util/SparseIntArray;

    invoke-direct {v10}, Landroid/util/SparseIntArray;-><init>()V

    .line 754
    invoke-virtual/range {p4 .. p4}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    .line 755
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object v0

    iget-object v0, v0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    if-eqz v0, :cond_1c

    const/4 v0, 0x1

    move v13, v0

    goto :goto_1d

    :cond_1c
    const/4 v13, 0x0

    :goto_1d
    const-wide v0, 0x7fffffffffffffffL

    const/4 v14, 0x0

    :goto_23
    if-ge v14, v11, :cond_142

    move-object/from16 v15, p4

    .line 757
    invoke-virtual {v15, v14}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/Rstring;

    move-object/from16 v6, p5

    .line 758
    invoke-virtual {v6, v14}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/Rstring;

    if-eqz v2, :cond_40

    .line 759
    iget-object v5, v2, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v5, v7}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_40

    const/4 v2, 0x0

    :cond_40
    if-eqz v3, :cond_4b

    .line 762
    iget-object v5, v3, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v5, v7}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4b

    const/4 v3, 0x0

    :cond_4b
    if-nez v2, :cond_57

    if-nez v3, :cond_57

    :cond_4f
    move/from16 v17, v11

    move/from16 v19, v13

    move/from16 v18, v14

    goto/16 :goto_13a

    :cond_57
    if-eqz v2, :cond_61

    if-eqz v3, :cond_61

    .line 769
    invoke-virtual {v7, v2, v3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;Lo/Rstring;)Z

    move-result v5

    if-eqz v5, :cond_4f

    .line 789
    :cond_61
    invoke-virtual {v7, v8, v2, v3}, Landroidx/transition/Transition;->read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;

    move-result-object v5

    if-eqz v5, :cond_4f

    if-eqz v3, :cond_ed

    .line 795
    iget-object v4, v3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 796
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->write()[Ljava/lang/String;

    move-result-object v12

    move-object/from16 v16, v5

    if-eqz v12, :cond_e6

    .line 797
    array-length v5, v12

    if-lez v5, :cond_e6

    .line 798
    new-instance v5, Lo/Rstring;

    invoke-direct {v5, v4}, Lo/Rstring;-><init>(Landroid/view/View;)V

    move/from16 v17, v11

    move-object/from16 v11, p3

    .line 799
    iget-object v6, v11, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {v6, v4}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/Rstring;

    if-eqz v6, :cond_ab

    const/4 v11, 0x0

    .line 801
    :goto_8a
    array-length v15, v12

    if-ge v11, v15, :cond_ab

    .line 802
    iget-object v15, v5, Lo/Rstring;->read:Ljava/util/Map;

    move/from16 v18, v14

    aget-object v14, v12, v11

    move/from16 v19, v13

    iget-object v13, v6, Lo/Rstring;->read:Ljava/util/Map;

    move-object/from16 v20, v6

    aget-object v6, v12, v11

    .line 803
    invoke-interface {v13, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 802
    invoke-interface {v15, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v11, v11, 0x1

    move/from16 v14, v18

    move/from16 v13, v19

    move-object/from16 v6, v20

    goto :goto_8a

    :cond_ab
    move/from16 v19, v13

    move/from16 v18, v14

    .line 806
    invoke-virtual {v9}, Lo/AppCompatCheckBox;->size()I

    move-result v6

    const/4 v11, 0x0

    :goto_b4
    if-ge v11, v6, :cond_e3

    .line 808
    invoke-virtual {v9, v11}, Lo/AppCompatCheckBox;->write(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/animation/Animator;

    .line 809
    invoke-virtual {v9, v12}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/transition/Transition$write;

    .line 810
    iget-object v13, v12, Landroidx/transition/Transition$write;->write:Lo/Rstring;

    if-eqz v13, :cond_e0

    iget-object v13, v12, Landroidx/transition/Transition$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    if-ne v13, v4, :cond_e0

    iget-object v13, v12, Landroidx/transition/Transition$write;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 811
    invoke-direct/range {p0 .. p0}, Landroidx/transition/Transition;->onPlayFromMediaId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e0

    .line 812
    iget-object v12, v12, Landroidx/transition/Transition$write;->write:Lo/Rstring;

    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e0

    const/4 v11, 0x0

    goto :goto_fa

    :cond_e0
    add-int/lit8 v11, v11, 0x1

    goto :goto_b4

    :cond_e3
    move-object/from16 v11, v16

    goto :goto_fa

    :cond_e6
    move/from16 v17, v11

    move/from16 v19, v13

    move/from16 v18, v14

    goto :goto_f7

    :cond_ed
    move-object/from16 v16, v5

    move/from16 v17, v11

    move/from16 v19, v13

    move/from16 v18, v14

    .line 821
    iget-object v4, v2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    :goto_f7
    move-object/from16 v11, v16

    const/4 v5, 0x0

    :goto_fa
    if-eqz v11, :cond_13a

    .line 824
    iget-object v6, v7, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    if-eqz v6, :cond_112

    .line 825
    invoke-virtual {v6, v8, v7, v2, v3}, Lo/Rcolor;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroidx/transition/Transition;Lo/Rstring;Lo/Rstring;)J

    move-result-wide v2

    .line 826
    iget-object v6, v7, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    long-to-int v12, v2

    invoke-virtual {v10, v6, v12}, Landroid/util/SparseIntArray;->put(II)V

    .line 827
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_112
    move-wide v12, v0

    .line 829
    invoke-direct/range {p0 .. p0}, Landroidx/transition/Transition;->onPlayFromMediaId()Ljava/lang/String;

    move-result-object v2

    .line 830
    new-instance v14, Landroidx/transition/Transition$write;

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getWindowId()Landroid/view/WindowId;

    move-result-object v6

    move-object v0, v14

    move-object v1, v4

    move-object/from16 v3, p0

    move-object v4, v6

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Landroidx/transition/Transition$write;-><init>(Landroid/view/View;Ljava/lang/String;Landroidx/transition/Transition;Landroid/view/WindowId;Lo/Rstring;Landroid/animation/Animator;)V

    if-eqz v19, :cond_131

    .line 832
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 833
    invoke-virtual {v0, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-object v11, v0

    .line 836
    :cond_131
    invoke-virtual {v9, v11, v14}, Lo/AppCompatCheckBox;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    iget-object v0, v7, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-wide v0, v12

    :cond_13a
    :goto_13a
    add-int/lit8 v14, v18, 0x1

    move/from16 v11, v17

    move/from16 v13, v19

    goto/16 :goto_23

    .line 842
    :cond_142
    invoke-virtual {v10}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-eqz v2, :cond_176

    const/4 v12, 0x0

    .line 843
    :goto_149
    invoke-virtual {v10}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v12, v2, :cond_176

    .line 844
    invoke-virtual {v10, v12}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    .line 845
    iget-object v3, v7, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    .line 846
    invoke-virtual {v9, v2}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition$write;

    .line 847
    invoke-virtual {v10, v12}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    int-to-long v3, v3

    iget-object v5, v2, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    .line 848
    invoke-virtual {v5}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v5

    .line 849
    iget-object v2, v2, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    sub-long/2addr v3, v0

    add-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_149

    :cond_176
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Z)V
    .registers 2

    if-eqz p1, :cond_18

    .line 1657
    iget-object p1, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object p1, p1, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {p1}, Lo/AppCompatCheckBox;->clear()V

    .line 1658
    iget-object p1, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object p1, p1, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 1659
    iget-object p0, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object p0, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p0}, Lo/setPresenter;->IconCompatParcelizer()V

    return-void

    .line 1661
    :cond_18
    iget-object p1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object p1, p1, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {p1}, Lo/AppCompatCheckBox;->clear()V

    .line 1662
    iget-object p1, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object p1, p1, Lo/Rdrawable;->read:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 1663
    iget-object p0, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object p0, p0, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {p0}, Lo/setPresenter;->IconCompatParcelizer()V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Landroidx/transition/Transition$AudioAttributesCompatParcelizer;
    .registers 1

    .line 2206
    iget-object p0, p0, Landroidx/transition/Transition;->handleMediaPlayPauseIfPendingOnHandler:Landroidx/transition/Transition$AudioAttributesCompatParcelizer;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Landroid/graphics/Rect;
    .registers 1

    .line 2218
    iget-object p0, p0, Landroidx/transition/Transition;->handleMediaPlayPauseIfPendingOnHandler:Landroidx/transition/Transition$AudioAttributesCompatParcelizer;

    if-nez p0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 2221
    :cond_6
    invoke-virtual {p0}, Landroidx/transition/Transition$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()J
    .registers 3

    .line 391
    iget-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    return-wide v0
.end method

.method final IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;
    .registers 8

    .line 1760
    iget-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    if-eqz v0, :cond_9

    .line 1761
    invoke-virtual {v0, p1, p2}, Landroidx/transition/TransitionSet;->IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object p0

    return-object p0

    :cond_9
    if-eqz p2, :cond_e

    .line 1763
    iget-object v0, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    goto :goto_10

    :cond_e
    iget-object v0, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    :goto_10
    const/4 v1, 0x0

    if-nez v0, :cond_14

    return-object v1

    .line 1767
    :cond_14
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_19
    if-ge v3, v2, :cond_2b

    .line 1770
    invoke-virtual {v0, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/Rstring;

    if-nez v4, :cond_24

    return-object v1

    .line 1775
    :cond_24
    iget-object v4, v4, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eq v4, p1, :cond_2c

    add-int/lit8 v3, v3, 0x1

    goto :goto_19

    :cond_2b
    const/4 v3, -0x1

    :cond_2c
    if-ltz v3, :cond_3c

    if-eqz p2, :cond_33

    .line 1782
    iget-object p0, p0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    goto :goto_35

    :cond_33
    iget-object p0, p0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    .line 1783
    :goto_35
    invoke-virtual {p0, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/Rstring;

    return-object p0

    :cond_3c
    return-object v1
.end method

.method public final IconCompatParcelizer()Lo/onReceive;
    .registers 2

    .line 529
    new-instance v0, Landroidx/transition/Transition$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/transition/Transition$IconCompatParcelizer;-><init>(Landroidx/transition/Transition;)V

    iput-object v0, p0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    .line 530
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    .line 531
    iget-object p0, p0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    return-object p0
.end method

.method public IconCompatParcelizer(Landroid/view/View;)V
    .registers 5

    .line 1796
    iget-boolean p1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    if-nez p1, :cond_30

    .line 1797
    iget-object p1, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    .line 1798
    iget-object v0, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    .line 1799
    sget-object v1, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    :goto_18
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_25

    .line 1801
    aget-object v1, v0, p1

    const/4 v2, 0x0

    .line 1802
    aput-object v2, v0, p1

    .line 1803
    invoke-virtual {v1}, Landroid/animation/Animator;->pause()V

    goto :goto_18

    .line 1805
    :cond_25
    iput-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    .line 1806
    sget-object p1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    const/4 p1, 0x1

    .line 1807
    iput-boolean p1, p0, Landroidx/transition/Transition;->onPrepare:Z

    :cond_30
    return-void
.end method

.method public IconCompatParcelizer(Landroidx/transition/PathMotion;)V
    .registers 2

    if-nez p1, :cond_7

    .line 2161
    sget-object p1, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver:Landroidx/transition/PathMotion;

    iput-object p1, p0, Landroidx/transition/Transition;->onPause:Landroidx/transition/PathMotion;

    return-void

    .line 2163
    :cond_7
    iput-object p1, p0, Landroidx/transition/Transition;->onPause:Landroidx/transition/PathMotion;

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;
    .registers 1

    .line 443
    iget-object p0, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V
    .registers 6

    .line 1819
    iget-boolean p1, p0, Landroidx/transition/Transition;->onPrepare:Z

    if-eqz p1, :cond_33

    .line 1820
    iget-boolean p1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    const/4 v0, 0x0

    if-nez p1, :cond_31

    .line 1821
    iget-object p1, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    .line 1822
    iget-object v1, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    .line 1823
    sget-object v2, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v2, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    :goto_1d
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_2a

    .line 1825
    aget-object v2, v1, p1

    const/4 v3, 0x0

    .line 1826
    aput-object v3, v1, p1

    .line 1827
    invoke-virtual {v2}, Landroid/animation/Animator;->resume()V

    goto :goto_1d

    .line 1829
    :cond_2a
    iput-object v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    .line 1830
    sget-object p1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0, p1, v0}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 1832
    :cond_31
    iput-boolean v0, p0, Landroidx/transition/Transition;->onPrepare:Z

    :cond_33
    return-void
.end method

.method protected final MediaBrowserCompatItemReceiver()V
    .registers 5

    .line 2045
    iget v0, p0, Landroidx/transition/Transition;->onFastForward:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Landroidx/transition/Transition;->onFastForward:I

    if-nez v0, :cond_4a

    .line 2047
    sget-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    move v0, v2

    .line 2048
    :goto_f
    iget-object v3, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object v3, v3, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {v3}, Lo/setPresenter;->write()I

    move-result v3

    if-ge v0, v3, :cond_2b

    .line 2049
    iget-object v3, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    iget-object v3, v3, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {v3, v0}, Lo/setPresenter;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_28

    .line 2051
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_28
    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_2b
    move v0, v2

    .line 2054
    :goto_2c
    iget-object v3, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object v3, v3, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {v3}, Lo/setPresenter;->write()I

    move-result v3

    if-ge v0, v3, :cond_48

    .line 2055
    iget-object v3, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    iget-object v3, v3, Lo/Rdrawable;->IconCompatParcelizer:Lo/setPresenter;

    invoke-virtual {v3, v0}, Lo/setPresenter;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_45

    .line 2057
    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_45
    add-int/lit8 v0, v0, 0x1

    goto :goto_2c

    .line 2060
    :cond_48
    iput-boolean v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    :cond_4a
    return-void
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1483
    iget-object p0, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;
    .registers 2

    .line 362
    iget-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    if-eqz v0, :cond_8

    .line 363
    invoke-virtual {v0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object p0

    :cond_8
    return-object p0
.end method

.method final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()J
    .registers 3

    .line 2357
    iget-wide v0, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    return-wide v0
.end method

.method public final MediaDescriptionCompat()Landroidx/transition/PathMotion;
    .registers 1

    .line 2177
    iget-object p0, p0, Landroidx/transition/Transition;->onPause:Landroidx/transition/PathMotion;

    return-object p0
.end method

.method public final MediaMetadataCompat()J
    .registers 3

    .line 417
    iget-wide v0, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    return-wide v0
.end method

.method public final RatingCompat()Lo/Rcolor;
    .registers 1

    .line 2252
    iget-object p0, p0, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()Landroidx/transition/Transition;
    .registers 3

    .line 2291
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    .line 2292
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    .line 2293
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, v0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    .line 2294
    new-instance v1, Lo/Rdrawable;

    invoke-direct {v1}, Lo/Rdrawable;-><init>()V

    iput-object v1, v0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    const/4 v1, 0x0

    .line 2295
    iput-object v1, v0, Landroidx/transition/Transition;->onSeekTo:Ljava/util/ArrayList;

    .line 2296
    iput-object v1, v0, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    .line 2297
    iput-object v1, v0, Landroidx/transition/Transition;->onPrepareFromMediaId:Landroidx/transition/Transition$IconCompatParcelizer;

    .line 2298
    iput-object p0, v0, Landroidx/transition/Transition;->MediaDescriptionCompat:Landroidx/transition/Transition;

    .line 2299
    iput-object v1, v0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;
    :try_end_26
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_26} :catch_27

    return-object v0

    :catch_27
    move-exception p0

    .line 2302
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;
    .registers 3

    .line 378
    iput-wide p1, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 3

    .line 1177
    iget-object v0, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;
    .registers 3

    .line 2116
    iget-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    if-nez v0, :cond_b

    .line 2117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    .line 2119
    :cond_b
    iget-object v0, p0, Landroidx/transition/Transition;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;
    .registers 4

    .line 1741
    iget-object v0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    if-eqz v0, :cond_9

    .line 1742
    invoke-virtual {v0, p1, p2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object p0

    return-object p0

    :cond_9
    if-eqz p2, :cond_e

    .line 1744
    iget-object p0, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    goto :goto_10

    :cond_e
    iget-object p0, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    .line 1745
    :goto_10
    iget-object p0, p0, Lo/Rdrawable;->write:Lo/setTitleOptional;

    invoke-virtual {p0, p1}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/Rstring;

    return-object p0
.end method

.method public abstract RemoteActionCompatParcelizer(Lo/Rstring;)V
.end method

.method public RemoteActionCompatParcelizer(Lo/Rstring;Lo/Rstring;)Z
    .registers 8

    const/4 v0, 0x0

    if-eqz p1, :cond_39

    if-eqz p2, :cond_39

    .line 1941
    invoke-virtual {p0}, Landroidx/transition/Transition;->write()[Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    if-eqz p0, :cond_1c

    .line 1943
    array-length v2, p0

    move v3, v0

    :goto_e
    if-ge v3, v2, :cond_39

    aget-object v4, p0, v3

    .line 1944
    invoke-static {p1, p2, v4}, Landroidx/transition/Transition;->read(Lo/Rstring;Lo/Rstring;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    return v1

    :cond_19
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    .line 1950
    :cond_1c
    iget-object p0, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_26
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1951
    invoke-static {p1, p2, v2}, Landroidx/transition/Transition;->read(Lo/Rstring;Lo/Rstring;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_26

    return v1

    :cond_39
    return v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 129
    invoke-virtual {p0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer()Landroidx/transition/Transition;

    move-result-object p0

    return-object p0
.end method

.method handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 1

    .line 1842
    iget-object p0, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final onAddQueueItem()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1510
    iget-object p0, p0, Landroidx/transition/Transition;->onSetPlaybackSpeed:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final onCommand()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1524
    iget-object p0, p0, Landroidx/transition/Transition;->setSessionImpl:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final onCustomAction()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1496
    iget-object p0, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    return-object p0
.end method

.method protected onMediaButtonEvent()V
    .registers 5

    .line 926
    invoke-virtual {p0}, Landroidx/transition/Transition;->onPlay()V

    .line 927
    invoke-static {}, Landroidx/transition/Transition;->onFastForward()Lo/setTitleOptional;

    move-result-object v0

    .line 929
    iget-object v1, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    .line 933
    invoke-virtual {v0, v2}, Lo/AppCompatCheckBox;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 934
    invoke-virtual {p0}, Landroidx/transition/Transition;->onPlay()V

    .line 935
    invoke-direct {p0, v2, v0}, Landroidx/transition/Transition;->write(Landroid/animation/Animator;Lo/setTitleOptional;)V

    goto :goto_d

    .line 938
    :cond_26
    iget-object v0, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 939
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method onPause()V
    .registers 12

    .line 971
    invoke-static {}, Landroidx/transition/Transition;->onFastForward()Lo/setTitleOptional;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 973
    iput-wide v1, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    const/4 v3, 0x0

    .line 974
    :goto_9
    iget-object v4, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v3, v4, :cond_6f

    .line 975
    iget-object v4, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    .line 979
    invoke-virtual {v0, v4}, Lo/AppCompatCheckBox;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/transition/Transition$write;

    if-eqz v4, :cond_6c

    if-eqz v5, :cond_6c

    .line 981
    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer()J

    move-result-wide v6

    cmp-long v6, v6, v1

    if-ltz v6, :cond_34

    .line 982
    iget-object v6, v5, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 984
    :cond_34
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v6

    cmp-long v6, v6, v1

    if-ltz v6, :cond_4c

    .line 985
    iget-object v6, v5, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    .line 986
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v7

    iget-object v9, v5, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    invoke-virtual {v9}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v9

    add-long/2addr v7, v9

    .line 985
    invoke-virtual {v6, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 988
    :cond_4c
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;

    move-result-object v6

    if-eqz v6, :cond_5b

    .line 989
    iget-object v5, v5, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 991
    :cond_5b
    iget-object v5, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 992
    iget-wide v5, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    invoke-static {v4}, Landroidx/transition/Transition$read;->read(Landroid/animation/Animator;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    :cond_6c
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    .line 995
    :cond_6f
    iget-object p0, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method protected final onPlay()V
    .registers 3

    .line 2026
    iget v0, p0, Landroidx/transition/Transition;->onFastForward:I

    if-nez v0, :cond_c

    .line 2027
    sget-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->write:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 2028
    iput-boolean v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 2030
    :cond_c
    iget v0, p0, Landroidx/transition/Transition;->onFastForward:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/Transition;->onFastForward:I

    return-void
.end method

.method public read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 4

    const/4 p0, 0x0

    return-object p0
.end method

.method public read(J)Landroidx/transition/Transition;
    .registers 3

    .line 404
    iput-wide p1, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    return-object p0
.end method

.method public read(Landroidx/transition/Transition$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 2192
    iput-object p1, p0, Landroidx/transition/Transition;->handleMediaPlayPauseIfPendingOnHandler:Landroidx/transition/Transition$AudioAttributesCompatParcelizer;

    return-void
.end method

.method final read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V
    .registers 3

    .line 2326
    invoke-direct {p0, p0, p1, p2}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroidx/transition/Transition;Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    return-void
.end method

.method public read(Lo/Rcolor;)V
    .registers 2

    .line 2236
    iput-object p1, p0, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    return-void
.end method

.method public abstract read(Lo/Rstring;)V
.end method

.method public read()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method final read(Landroid/view/View;)Z
    .registers 5

    .line 865
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 886
    iget-object v1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_16

    iget-object v1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-nez v1, :cond_16

    return v2

    .line 891
    :cond_16
    iget-object v1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    iget-object p0, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2c

    const/4 p0, 0x0

    return p0

    :cond_2c
    return v2
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 2285
    const-string v0, ""

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->write(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;
    .registers 2

    .line 430
    iput-object p1, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method write(Ljava/lang/String;)Ljava/lang/String;
    .registers 9

    .line 2405
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2406
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2407
    const-string p1, "@"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2408
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2409
    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2410
    iget-wide v1, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    const-wide/16 v3, -0x1

    cmp-long p1, v1, v3

    const-string v1, ") "

    if-eqz p1, :cond_3c

    .line 2411
    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    .line 2412
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2413
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2415
    :cond_3c
    iget-wide v5, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    cmp-long p1, v5, v3

    if-eqz p1, :cond_4f

    .line 2416
    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Landroidx/transition/Transition;->onPrepareFromSearch:J

    .line 2417
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2418
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2420
    :cond_4f
    iget-object p1, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    if-eqz p1, :cond_60

    .line 2421
    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/transition/Transition;->onCustomAction:Landroid/animation/TimeInterpolator;

    .line 2422
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2423
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2425
    :cond_60
    iget-object p1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-gtz p1, :cond_70

    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-lez p1, :cond_c0

    .line 2426
    :cond_70
    const-string p1, "tgts("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2427
    iget-object p1, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez p1, :cond_9a

    move p1, v2

    .line 2428
    :goto_81
    iget-object v3, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge p1, v3, :cond_9a

    if-lez p1, :cond_8e

    .line 2430
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2432
    :cond_8e
    iget-object v3, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_81

    .line 2435
    :cond_9a
    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-lez p1, :cond_bb

    .line 2436
    :goto_a2
    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-ge v2, p1, :cond_bb

    if-lez v2, :cond_af

    .line 2438
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2440
    :cond_af
    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_a2

    .line 2443
    :cond_bb
    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2445
    :cond_c0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method write(JJ)V
    .registers 22

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 2373
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()J

    move-result-wide v3

    cmp-long v5, v1, p3

    const/4 v7, 0x0

    if-gez v5, :cond_f

    const/4 v5, 0x1

    goto :goto_10

    :cond_f
    move v5, v7

    :goto_10
    const-wide/16 v8, 0x0

    cmp-long v10, p3, v8

    if-gez v10, :cond_1a

    cmp-long v11, v1, v8

    if-gez v11, :cond_22

    :cond_1a
    cmp-long v11, p3, v3

    if-lez v11, :cond_29

    cmp-long v11, v1, v3

    if-gtz v11, :cond_29

    .line 2377
    :cond_22
    iput-boolean v7, v0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 2378
    sget-object v11, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->write:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v0, v11, v5}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 2380
    :cond_29
    iget-object v11, v0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    .line 2381
    iget-object v12, v0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    iget-object v13, v0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    invoke-virtual {v12, v13}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Landroid/animation/Animator;

    .line 2382
    sget-object v13, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer:[Landroid/animation/Animator;

    iput-object v13, v0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    :goto_3d
    if-ge v7, v11, :cond_58

    .line 2384
    aget-object v13, v12, v7

    const/4 v14, 0x0

    .line 2385
    aput-object v14, v12, v7

    .line 2386
    invoke-static {v13}, Landroidx/transition/Transition$read;->read(Landroid/animation/Animator;)J

    move-result-wide v14

    move/from16 v16, v7

    .line 2387
    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 2388
    invoke-static {v13, v6, v7}, Landroidx/transition/Transition$read;->read(Landroid/animation/Animator;J)V

    add-int/lit8 v7, v16, 0x1

    goto :goto_3d

    .line 2390
    :cond_58
    iput-object v12, v0, Landroidx/transition/Transition;->MediaBrowserCompatMediaItem:[Landroid/animation/Animator;

    cmp-long v6, v1, v3

    if-lez v6, :cond_62

    cmp-long v3, p3, v3

    if-lez v3, :cond_68

    :cond_62
    cmp-long v1, v1, v8

    if-gez v1, :cond_72

    if-ltz v10, :cond_72

    :cond_68
    if-lez v6, :cond_6d

    const/4 v1, 0x1

    .line 2398
    iput-boolean v1, v0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 2400
    :cond_6d
    sget-object v1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v0, v1, v5}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    :cond_72
    return-void
.end method

.method public final write(Landroid/view/ViewGroup;Z)V
    .registers 8

    .line 1550
    invoke-virtual {p0, p2}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Z)V

    .line 1551
    iget-object v0, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-gtz v0, :cond_19

    iget-object v0, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lez v0, :cond_14

    goto :goto_19

    .line 1590
    :cond_14
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;->read(Landroid/view/View;Z)V

    goto/16 :goto_91

    :cond_19
    :goto_19
    const/4 v0, 0x0

    move v1, v0

    .line 1554
    :goto_1b
    iget-object v2, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_5b

    .line 1555
    iget-object v2, p0, Landroidx/transition/Transition;->onSetCaptioningEnabled:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 1556
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_58

    .line 1558
    new-instance v3, Lo/Rstring;

    invoke-direct {v3, v2}, Lo/Rstring;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_40

    .line 1560
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->read(Lo/Rstring;)V

    goto :goto_43

    .line 1562
    :cond_40
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 1564
    :goto_43
    iget-object v4, v3, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1565
    invoke-virtual {p0, v3}, Landroidx/transition/Transition;->write(Lo/Rstring;)V

    if-eqz p2, :cond_53

    .line 1567
    iget-object v4, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    invoke-static {v4, v2, v3}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    goto :goto_58

    .line 1569
    :cond_53
    iget-object v4, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    invoke-static {v4, v2, v3}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    :cond_58
    :goto_58
    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    .line 1573
    :cond_5b
    :goto_5b
    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-ge v0, p1, :cond_91

    .line 1574
    iget-object p1, p0, Landroidx/transition/Transition;->onSkipToNext:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 1575
    new-instance v1, Lo/Rstring;

    invoke-direct {v1, p1}, Lo/Rstring;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_76

    .line 1577
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->read(Lo/Rstring;)V

    goto :goto_79

    .line 1579
    :cond_76
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 1581
    :goto_79
    iget-object v2, v1, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1582
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->write(Lo/Rstring;)V

    if-eqz p2, :cond_89

    .line 1584
    iget-object v2, p0, Landroidx/transition/Transition;->onPlayFromUri:Lo/Rdrawable;

    invoke-static {v2, p1, v1}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    goto :goto_8e

    .line 1586
    :cond_89
    iget-object v2, p0, Landroidx/transition/Transition;->MediaMetadataCompat:Lo/Rdrawable;

    invoke-static {v2, p1, v1}, Landroidx/transition/Transition;->write(Lo/Rdrawable;Landroid/view/View;Lo/Rstring;)V

    :goto_8e
    add-int/lit8 v0, v0, 0x1

    goto :goto_5b

    :cond_91
    :goto_91
    return-void
.end method

.method write(Lo/Rstring;)V
    .registers 6

    .line 2260
    iget-object v0, p0, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    if-eqz v0, :cond_2b

    iget-object v0, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2b

    .line 2261
    iget-object v0, p0, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    invoke-virtual {v0}, Lo/Rcolor;->read()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2b

    const/4 v1, 0x0

    .line 2267
    :goto_15
    array-length v2, v0

    if-ge v1, v2, :cond_2b

    .line 2268
    iget-object v2, p1, Lo/Rstring;->read:Ljava/util/Map;

    aget-object v3, v0, v1

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    .line 2274
    iget-object p0, p0, Landroidx/transition/Transition;->onPlayFromSearch:Lo/Rcolor;

    invoke-virtual {p0, p1}, Lo/Rcolor;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    return-void

    :cond_28
    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_2b
    return-void
.end method

.method public write()[Ljava/lang/String;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

###### Class androidx.transition.Transition.AnonymousClass1 (androidx.transition.Transition$1)
.class final Landroidx/transition/Transition$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/Transition;->write(Landroid/animation/Animator;Lo/setTitleOptional;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Lo/setTitleOptional;

.field final synthetic write:Landroidx/transition/Transition;


# direct methods
.method constructor <init>(Landroidx/transition/Transition;Lo/setTitleOptional;)V
    .registers 3

    .line 946
    iput-object p1, p0, Landroidx/transition/Transition$1;->write:Landroidx/transition/Transition;

    iput-object p2, p0, Landroidx/transition/Transition$1;->RemoteActionCompatParcelizer:Lo/setTitleOptional;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    .line 954
    iget-object v0, p0, Landroidx/transition/Transition$1;->RemoteActionCompatParcelizer:Lo/setTitleOptional;

    invoke-virtual {v0, p1}, Lo/AppCompatCheckBox;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    iget-object p0, p0, Landroidx/transition/Transition$1;->write:Landroidx/transition/Transition;

    iget-object p0, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    .line 949
    iget-object p0, p0, Landroidx/transition/Transition$1;->write:Landroidx/transition/Transition;

    iget-object p0, p0, Landroidx/transition/Transition;->write:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

###### Class androidx.transition.Transition.AnonymousClass2 (androidx.transition.Transition$2)
.class final Landroidx/transition/Transition$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/Transition;->read(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/transition/Transition;


# direct methods
.method constructor <init>(Landroidx/transition/Transition;)V
    .registers 2

    .line 2007
    iput-object p1, p0, Landroidx/transition/Transition$2;->IconCompatParcelizer:Landroidx/transition/Transition;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    .line 2010
    iget-object v0, p0, Landroidx/transition/Transition$2;->IconCompatParcelizer:Landroidx/transition/Transition;

    invoke-virtual {v0}, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver()V

    .line 2011
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

###### Class androidx.transition.Transition.AnonymousClass3 (androidx.transition.Transition$3)
.class final Landroidx/transition/Transition$3;
.super Landroidx/transition/PathMotion;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 181
    invoke-direct {p0}, Landroidx/transition/PathMotion;-><init>()V

    return-void
.end method


# virtual methods
.method public final write(FFFF)Landroid/graphics/Path;
    .registers 5

    .line 184
    new-instance p0, Landroid/graphics/Path;

    invoke-direct {p0}, Landroid/graphics/Path;-><init>()V

    .line 185
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 186
    invoke-virtual {p0, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    return-object p0
.end method

###### Class androidx.transition.Transition.AudioAttributesCompatParcelizer (androidx.transition.Transition$AudioAttributesCompatParcelizer)
.class public abstract Landroidx/transition/Transition$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 2619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract IconCompatParcelizer()Landroid/graphics/Rect;
.end method

###### Class androidx.transition.Transition.AudioAttributesImplBaseParcelizer (androidx.transition.Transition$AudioAttributesImplBaseParcelizer)
.class public interface abstract Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesImplBaseParcelizer"
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

.field public static final IconCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

.field public static final RemoteActionCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

.field public static final read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

.field public static final write:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2654
    new-instance v0, Lo/GoogleConversionPingConversionType;

    invoke-direct {v0}, Lo/GoogleConversionPingConversionType;-><init>()V

    sput-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->write:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    .line 2659
    new-instance v0, Lo/recordConversionPing;

    invoke-direct {v0}, Lo/recordConversionPing;-><init>()V

    sput-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    .line 2664
    new-instance v0, Lo/IAPConversionReporter;

    invoke-direct {v0}, Lo/IAPConversionReporter;-><init>()V

    sput-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    .line 2670
    new-instance v0, Lo/GoogleConversionReporter;

    invoke-direct {v0}, Lo/GoogleConversionReporter;-><init>()V

    sput-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    .line 2676
    new-instance v0, Lo/InstallReceiver;

    invoke-direct {v0}, Lo/InstallReceiver;-><init>()V

    sput-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->AudioAttributesCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    return-void
.end method

.method public static synthetic IconCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)V
    .registers 1

    .line 2671
    invoke-interface {p0}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    return-void
.end method

.method public static synthetic read(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)V
    .registers 1

    .line 2677
    invoke-interface {p0}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public static synthetic write(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 2

    .line 2665
    invoke-interface {p0, p1}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V

    return-void
.end method


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
.end method

###### Class kotlin.GoogleConversionPingConversionType (o.GoogleConversionPingConversionType)
.class public final synthetic Lo/GoogleConversionPingConversionType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 3

    .line 0
    invoke-interface {p1, p2}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->write(Landroidx/transition/Transition;)V

    return-void
.end method

###### Class kotlin.GoogleConversionReporter (o.GoogleConversionReporter)
.class public final synthetic Lo/GoogleConversionReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 3

    .line 0
    invoke-static {p1}, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)V

    return-void
.end method

###### Class kotlin.IAPConversionReporter (o.IAPConversionReporter)
.class public final synthetic Lo/IAPConversionReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 3

    .line 0
    invoke-static {p1, p2}, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->write(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V

    return-void
.end method

###### Class kotlin.InstallReceiver (o.InstallReceiver)
.class public final synthetic Lo/InstallReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 3

    .line 0
    invoke-static {p1}, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)V

    return-void
.end method

###### Class kotlin.recordConversionPing (o.recordConversionPing)
.class public final synthetic Lo/recordConversionPing;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;Landroidx/transition/Transition;)V
    .registers 3

    .line 0
    invoke-interface {p1, p2}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/transition/Transition;)V

    return-void
.end method

###### Class androidx.transition.Transition.IconCompatParcelizer (androidx.transition.Transition$IconCompatParcelizer)
.class public final Landroidx/transition/Transition$IconCompatParcelizer;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"

# interfaces
.implements Lo/onReceive;
.implements Lo/findAliases$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:[Lo/wrapAsJsonMappingException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lo/wrapAsJsonMappingException<",
            "Lo/onReceive;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

.field private AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/wrapAsJsonMappingException<",
            "Lo/onReceive;",
            ">;>;"
        }
    .end annotation
.end field

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

.field private MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo/wrapAsJsonMappingException<",
            "Lo/onReceive;",
            ">;>;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatMediaItem:Lo/aa;

.field private RemoteActionCompatParcelizer:J

.field final synthetic read:Landroidx/transition/Transition;

.field private write:Z


# direct methods
.method constructor <init>(Landroidx/transition/Transition;)V
    .registers 4

    .line 2695
    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    const-wide/16 v0, -0x1

    .line 2701
    iput-wide v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    const/4 p1, 0x0

    .line 2702
    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    .line 2703
    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2706
    iput v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    .line 2709
    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesCompatParcelizer:[Lo/wrapAsJsonMappingException;

    .line 2710
    new-instance p1, Lo/aa;

    invoke-direct {p1}, Lo/aa;-><init>()V

    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatMediaItem:Lo/aa;

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 6

    .line 2839
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    if-eqz v0, :cond_5

    return-void

    .line 2842
    :cond_5
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatMediaItem:Lo/aa;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    long-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo/aa;->RemoteActionCompatParcelizer(JF)V

    .line 2844
    new-instance v0, Lo/ConcreteBeanPropertyBase;

    new-instance v1, Lo/collectDefaultFromBundle;

    invoke-direct {v1}, Lo/collectDefaultFromBundle;-><init>()V

    invoke-direct {v0, v1}, Lo/ConcreteBeanPropertyBase;-><init>(Lo/collectDefaultFromBundle;)V

    iput-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    .line 2845
    new-instance v0, Lo/legacyManglePropertyName;

    invoke-direct {v0}, Lo/legacyManglePropertyName;-><init>()V

    .line 2846
    invoke-virtual {v0}, Lo/legacyManglePropertyName;->write()Lo/legacyManglePropertyName;

    const/high16 v1, 0x43480000    # 200.0f

    .line 2847
    invoke-virtual {v0, v1}, Lo/legacyManglePropertyName;->AudioAttributesCompatParcelizer(F)Lo/legacyManglePropertyName;

    .line 2848
    iget-object v1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {v1, v0}, Lo/ConcreteBeanPropertyBase;->IconCompatParcelizer(Lo/legacyManglePropertyName;)Lo/ConcreteBeanPropertyBase;

    .line 2849
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    iget-wide v1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/findAliases;->AudioAttributesCompatParcelizer(F)Lo/findAliases;

    .line 2850
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {v0, p0}, Lo/findAliases;->write(Lo/findAliases$AudioAttributesCompatParcelizer;)Lo/findAliases;

    .line 2851
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    iget-object v1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatMediaItem:Lo/aa;

    invoke-virtual {v1}, Lo/aa;->RemoteActionCompatParcelizer()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/findAliases;->RemoteActionCompatParcelizer(F)Lo/findAliases;

    .line 2852
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/findAliases;->write(F)Lo/findAliases;

    .line 2853
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {v0}, Lo/findAliases;->read()Lo/findAliases;

    .line 2854
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {v0}, Lo/findAliases;->IconCompatParcelizer()Lo/findAliases;

    .line 2855
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    new-instance v1, Lo/GoogleConversionPing;

    invoke-direct {v1, p0}, Lo/GoogleConversionPing;-><init>(Landroidx/transition/Transition$IconCompatParcelizer;)V

    invoke-virtual {v0, v1}, Lo/findAliases;->write(Lo/findAliases$write;)Lo/findAliases;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    const/4 p1, 0x1

    .line 2827
    iput-boolean p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->write:Z

    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()V
    .registers 4

    const/4 v0, 0x1

    .line 2734
    iput-boolean v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->IconCompatParcelizer:Z

    .line 2743
    iget v1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    const/4 v2, 0x0

    if-ne v1, v0, :cond_e

    .line 2744
    iput v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    .line 2745
    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->write()V

    return-void

    :cond_e
    const/4 v0, 0x2

    if-ne v1, v0, :cond_18

    .line 2747
    iput v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    .line 2748
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroidx/transition/Transition$IconCompatParcelizer;->read(Ljava/lang/Runnable;)V

    :cond_18
    return-void
.end method

.method public final synthetic IconCompatParcelizer(ZF)V
    .registers 9

    if-nez p1, :cond_4a

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p2, p1

    const/4 p2, 0x0

    if-gez p1, :cond_43

    .line 2860
    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v0

    .line 2862
    iget-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    check-cast p1, Landroidx/transition/TransitionSet;

    invoke-virtual {p1, p2}, Landroidx/transition/TransitionSet;->AudioAttributesCompatParcelizer(I)Landroidx/transition/Transition;

    move-result-object p1

    .line 2863
    invoke-static {p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)Landroidx/transition/Transition;

    move-result-object p2

    .line 2864
    invoke-static {p1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition;)Landroidx/transition/Transition;

    .line 2865
    iget-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    iget-wide v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    const-wide/16 v4, -0x1

    invoke-virtual {p1, v4, v5, v2, v3}, Landroidx/transition/Transition;->write(JJ)V

    .line 2866
    iget-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    invoke-virtual {p1, v0, v1, v4, v5}, Landroidx/transition/Transition;->write(JJ)V

    .line 2867
    iput-wide v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    .line 2868
    iget-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    if-eqz p1, :cond_33

    .line 2869
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 2871
    :cond_33
    iget-object p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    iget-object p0, p0, Landroidx/transition/Transition;->read:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    if-eqz p2, :cond_4a

    .line 2873
    sget-object p0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 p1, 0x1

    invoke-virtual {p2, p0, p1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    return-void

    .line 2876
    :cond_43
    iget-object p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    sget-object p1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0, p1, p2}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    :cond_4a
    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 2730
    iget-boolean p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->IconCompatParcelizer:Z

    return p0
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 7

    .line 2785
    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_c

    const-wide/16 v2, 0x1

    .line 2786
    :cond_c
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    iget-wide v4, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    invoke-virtual {v0, v2, v3, v4, v5}, Landroidx/transition/Transition;->write(JJ)V

    .line 2787
    iput-wide v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    return-void
.end method

.method public final RemoteActionCompatParcelizer(F)V
    .registers 6

    .line 2832
    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 2833
    iget-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    iget-wide v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    invoke-virtual {p1, v0, v1, v2, v3}, Landroidx/transition/Transition;->write(JJ)V

    .line 2834
    iput-wide v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    return-void
.end method

.method public final read()J
    .registers 3

    .line 2715
    iget-object p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()J

    move-result-wide v0

    return-wide v0
.end method

.method public final read(J)V
    .registers 7

    .line 2754
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    if-nez v0, :cond_4d

    .line 2758
    iget-wide v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_4c

    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_4c

    .line 2763
    iget-boolean v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->write:Z

    if-nez v0, :cond_42

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_23

    .line 2764
    iget-wide v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_23

    const-wide/16 p1, -0x1

    goto :goto_35

    .line 2768
    :cond_23
    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_35

    .line 2770
    iget-wide v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_35

    const-wide/16 p1, 0x1

    add-long/2addr v0, p1

    move-wide p1, v0

    .line 2774
    :cond_35
    :goto_35
    iget-wide v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_42

    .line 2775
    iget-object v2, p0, Landroidx/transition/Transition$IconCompatParcelizer;->read:Landroidx/transition/Transition;

    invoke-virtual {v2, p1, p2, v0, v1}, Landroidx/transition/Transition;->write(JJ)V

    .line 2776
    iput-wide p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->RemoteActionCompatParcelizer:J

    .line 2780
    :cond_42
    iget-object p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatMediaItem:Lo/aa;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    long-to-float p1, p1

    invoke-virtual {p0, v0, v1, p1}, Lo/aa;->RemoteActionCompatParcelizer(JF)V

    :cond_4c
    return-void

    .line 2755
    :cond_4d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "setCurrentPlayTimeMillis() called after animation has been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final read(Ljava/lang/Runnable;)V
    .registers 2

    .line 2895
    iput-object p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    .line 2896
    iget-boolean p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->IconCompatParcelizer:Z

    if-nez p1, :cond_a

    const/4 p1, 0x2

    .line 2897
    iput p1, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    return-void

    .line 2900
    :cond_a
    invoke-direct {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2901
    iget-object p0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lo/ConcreteBeanPropertyBase;->IconCompatParcelizer(F)V

    return-void
.end method

.method public final write()V
    .registers 6

    .line 2884
    iget-boolean v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->IconCompatParcelizer:Z

    if-nez v0, :cond_b

    const/4 v0, 0x1

    .line 2885
    iput v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    const/4 v0, 0x0

    .line 2886
    iput-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    return-void

    .line 2889
    :cond_b
    invoke-direct {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2890
    iget-object v0, p0, Landroidx/transition/Transition$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/ConcreteBeanPropertyBase;

    invoke-virtual {p0}, Landroidx/transition/Transition$IconCompatParcelizer;->read()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float p0, v1

    invoke-virtual {v0, p0}, Lo/ConcreteBeanPropertyBase;->IconCompatParcelizer(F)V

    return-void
.end method

###### Class kotlin.GoogleConversionPing (o.GoogleConversionPing)
.class public final synthetic Lo/GoogleConversionPing;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/findAliases$write;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/transition/Transition$IconCompatParcelizer;


# direct methods
.method public synthetic constructor <init>(Landroidx/transition/Transition$IconCompatParcelizer;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/GoogleConversionPing;->IconCompatParcelizer:Landroidx/transition/Transition$IconCompatParcelizer;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(ZF)V
    .registers 3

    .line 0
    iget-object p0, p0, Lo/GoogleConversionPing;->IconCompatParcelizer:Landroidx/transition/Transition$IconCompatParcelizer;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Landroidx/transition/Transition$IconCompatParcelizer;->IconCompatParcelizer(ZF)V

    return-void
.end method

###### Class androidx.transition.Transition.RemoteActionCompatParcelizer (androidx.transition.Transition$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/transition/Transition$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()V
.end method

.method public abstract AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
.end method

.method public abstract IconCompatParcelizer()V
.end method

.method public abstract IconCompatParcelizer(Landroidx/transition/Transition;)V
.end method

.method public RemoteActionCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    .line 2494
    invoke-interface {p0, p1}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->read(Landroidx/transition/Transition;)V

    return-void
.end method

.method public abstract read(Landroidx/transition/Transition;)V
.end method

.method public write(Landroidx/transition/Transition;)V
    .registers 2

    .line 2468
    invoke-interface {p0, p1}, Landroidx/transition/Transition$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroidx/transition/Transition;)V

    return-void
.end method

###### Class androidx.transition.Transition.read (androidx.transition.Transition$read)
.class final Landroidx/transition/Transition$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method static read(Landroid/animation/Animator;)J
    .registers 3

    .line 2683
    invoke-virtual {p0}, Landroid/animation/Animator;->getTotalDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method static read(Landroid/animation/Animator;J)V
    .registers 3

    .line 2687
    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0, p1, p2}, Landroid/animation/AnimatorSet;->setCurrentPlayTime(J)V

    return-void
.end method

###### Class androidx.transition.Transition.write (androidx.transition.Transition$write)
.class final Landroidx/transition/Transition$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/lang/String;

.field AudioAttributesImplApi21Parcelizer:Landroid/view/WindowId;

.field IconCompatParcelizer:Landroidx/transition/Transition;

.field RemoteActionCompatParcelizer:Landroid/view/View;

.field read:Landroid/animation/Animator;

.field write:Lo/Rstring;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/String;Landroidx/transition/Transition;Landroid/view/WindowId;Lo/Rstring;Landroid/animation/Animator;)V
    .registers 7

    .line 2555
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2556
    iput-object p1, p0, Landroidx/transition/Transition$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    .line 2557
    iput-object p2, p0, Landroidx/transition/Transition$write;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 2558
    iput-object p5, p0, Landroidx/transition/Transition$write;->write:Lo/Rstring;

    .line 2559
    iput-object p4, p0, Landroidx/transition/Transition$write;->AudioAttributesImplApi21Parcelizer:Landroid/view/WindowId;

    .line 2560
    iput-object p3, p0, Landroidx/transition/Transition$write;->IconCompatParcelizer:Landroidx/transition/Transition;

    .line 2561
    iput-object p6, p0, Landroidx/transition/Transition$write;->read:Landroid/animation/Animator;

    return-void
.end method
