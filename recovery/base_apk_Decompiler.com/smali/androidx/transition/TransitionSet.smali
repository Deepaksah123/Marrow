###### Class androidx.transition.TransitionSet (androidx.transition.TransitionSet)
.class public Landroidx/transition/TransitionSet;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/TransitionSet$read;
    }
.end annotation


# instance fields
.field AudioAttributesImplApi21Parcelizer:Z

.field MediaBrowserCompatMediaItem:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition;",
            ">;"
        }
    .end annotation
.end field

.field private MediaDescriptionCompat:[Landroidx/transition/Transition;

.field private MediaMetadataCompat:Z

.field private RatingCompat:I

.field RemoteActionCompatParcelizer:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 114
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    const/4 v0, 0x0

    .line 87
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer:Z

    .line 91
    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 118
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    const/4 v0, 0x0

    .line 87
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer:Z

    .line 91
    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    .line 119
    sget-object v1, Lo/recordRemarketingPing;->AudioAttributesImplApi26Parcelizer:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 120
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "transitionOrdering"

    invoke-static {p1, p2, v1, v0, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 123
    invoke-virtual {p0, p2}, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer(I)Landroidx/transition/TransitionSet;

    .line 124
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(J)Landroidx/transition/TransitionSet;
    .registers 3

    .line 249
    invoke-super {p0, p1, p2}, Landroidx/transition/Transition;->read(J)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method private AudioAttributesImplApi21Parcelizer(Landroid/view/View;)Landroidx/transition/TransitionSet;
    .registers 4

    const/4 v0, 0x0

    .line 311
    :goto_1
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    .line 312
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 314
    :cond_17
    invoke-super {p0, p1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method private IconCompatParcelizer([Landroidx/transition/Transition;)V
    .registers 3

    const/4 v0, 0x0

    .line 697
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 698
    iput-object p1, p0, Landroidx/transition/TransitionSet;->MediaDescriptionCompat:[Landroidx/transition/Transition;

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 3

    .line 199
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 200
    iput-object p0, p1, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    return-void
.end method

.method private onFastForward()V
    .registers 4

    .line 399
    new-instance v0, Landroidx/transition/TransitionSet$read;

    invoke-direct {v0, p0}, Landroidx/transition/TransitionSet$read;-><init>(Landroidx/transition/TransitionSet;)V

    .line 400
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 401
    invoke-virtual {v2, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    goto :goto_b

    .line 403
    :cond_1b
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    iput v0, p0, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method private onPrepareFromMediaId()[Landroidx/transition/Transition;
    .registers 3

    .line 684
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaDescriptionCompat:[Landroidx/transition/Transition;

    const/4 v1, 0x0

    .line 685
    iput-object v1, p0, Landroidx/transition/TransitionSet;->MediaDescriptionCompat:[Landroidx/transition/Transition;

    if-nez v0, :cond_f

    .line 687
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    new-array v0, v0, [Landroidx/transition/Transition;

    .line 689
    :cond_f
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroidx/transition/Transition;

    return-object p0
.end method

.method private read(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/TransitionSet;
    .registers 2

    .line 367
    invoke-super {p0, p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method private write(J)I
    .registers 7

    const/4 v0, 0x1

    move v1, v0

    .line 545
    :goto_2
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1d

    .line 546
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 547
    iget-wide v2, v2, Landroidx/transition/Transition;->AudioAttributesImplApi26Parcelizer:J

    cmp-long v2, v2, p1

    if-lez v2, :cond_1a

    sub-int/2addr v1, v0

    return v1

    :cond_1a
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 551
    :cond_1d
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    sub-int/2addr p0, v0

    return p0
.end method

.method private write(Landroid/view/View;)Landroidx/transition/TransitionSet;
    .registers 4

    const/4 v0, 0x0

    .line 266
    :goto_1
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_17

    .line 267
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 269
    :cond_17
    invoke-super {p0, p1}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method private write(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/TransitionSet;
    .registers 2

    .line 298
    invoke-super {p0, p1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(I)Landroidx/transition/Transition;
    .registers 3

    if-ltz p1, :cond_13

    .line 222
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_13

    .line 225
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/transition/Transition;

    return-object p0

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 2

    .line 65
    invoke-direct {p0, p1}, Landroidx/transition/TransitionSet;->write(Landroid/view/View;)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;
    .registers 2

    .line 65
    invoke-direct {p0, p1}, Landroidx/transition/TransitionSet;->read(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;
    .registers 5

    .line 254
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    .line 255
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    if-eqz v0, :cond_1f

    .line 256
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v0, :cond_1f

    .line 258
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    .line 261
    :cond_1f
    invoke-super {p0, p1}, Landroidx/transition/Transition;->write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    move-result-object p0

    check-cast p0, Landroidx/transition/TransitionSet;

    return-object p0
.end method

.method protected final AudioAttributesCompatParcelizer()V
    .registers 5

    .line 718
    invoke-super {p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer()V

    .line 719
    invoke-direct {p0}, Landroidx/transition/TransitionSet;->onPrepareFromMediaId()[Landroidx/transition/Transition;

    move-result-object v0

    .line 720
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v1, :cond_18

    .line 722
    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    .line 724
    :cond_18
    invoke-direct {p0, v0}, Landroidx/transition/TransitionSet;->IconCompatParcelizer([Landroidx/transition/Transition;)V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rdrawable;Lo/Rdrawable;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 18
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

    move-object v0, p0

    .line 444
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v1

    .line 445
    iget-object v3, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v3, :cond_40

    .line 447
    iget-object v5, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroidx/transition/Transition;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_33

    .line 450
    iget-boolean v5, v0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    if-nez v5, :cond_23

    if-nez v4, :cond_33

    .line 451
    :cond_23
    invoke-virtual {v6}, Landroidx/transition/Transition;->MediaMetadataCompat()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_30

    add-long/2addr v9, v1

    .line 453
    invoke-virtual {v6, v9, v10}, Landroidx/transition/Transition;->read(J)Landroidx/transition/Transition;

    goto :goto_33

    .line 455
    :cond_30
    invoke-virtual {v6, v1, v2}, Landroidx/transition/Transition;->read(J)Landroidx/transition/Transition;

    :cond_33
    :goto_33
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    .line 458
    invoke-virtual/range {v6 .. v11}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rdrawable;Lo/Rdrawable;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_40
    return-void
.end method

.method public final IconCompatParcelizer(J)Landroidx/transition/TransitionSet;
    .registers 7

    .line 237
    invoke-super {p0, p1, p2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;

    .line 238
    iget-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_24

    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    if-eqz v0, :cond_24

    .line 239
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_24

    .line 241
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1, p2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;

    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_24
    return-object p0
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)Landroidx/transition/TransitionSet;
    .registers 6

    .line 179
    invoke-direct {p0, p1}, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer(Landroidx/transition/Transition;)V

    .line 180
    iget-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_10

    .line 181
    iget-wide v0, p0, Landroidx/transition/Transition;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;

    .line 183
    :cond_10
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1d

    .line 184
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;

    .line 186
    :cond_1d
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2a

    .line 187
    invoke-virtual {p0}, Landroidx/transition/Transition;->RatingCompat()Lo/Rcolor;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    .line 189
    :cond_2a
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_37

    .line 190
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroidx/transition/PathMotion;)V

    .line 192
    :cond_37
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_44

    .line 193
    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplApi21Parcelizer()Landroidx/transition/Transition$AudioAttributesCompatParcelizer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesCompatParcelizer;)V

    :cond_44
    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/view/View;)V
    .registers 5

    .line 664
    invoke-super {p0, p1}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroid/view/View;)V

    .line 665
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    .line 667
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/PathMotion;)V
    .registers 4

    .line 372
    invoke-super {p0, p1}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroidx/transition/PathMotion;)V

    .line 373
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    .line 374
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    if-eqz v0, :cond_24

    const/4 v0, 0x0

    .line 375
    :goto_e
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_24

    .line 376
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->IconCompatParcelizer(Landroidx/transition/PathMotion;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    :cond_24
    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V
    .registers 6

    .line 706
    invoke-super {p0, p1}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V

    .line 707
    invoke-direct {p0}, Landroidx/transition/TransitionSet;->onPrepareFromMediaId()[Landroidx/transition/Transition;

    move-result-object v0

    .line 708
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v1, :cond_18

    .line 710
    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    .line 712
    :cond_18
    invoke-direct {p0, v0}, Landroidx/transition/TransitionSet;->IconCompatParcelizer([Landroidx/transition/Transition;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Landroidx/transition/Transition;
    .registers 5

    .line 779
    invoke-super {p0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer()Landroidx/transition/Transition;

    move-result-object v0

    check-cast v0, Landroidx/transition/TransitionSet;

    .line 780
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    .line 781
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v1, :cond_28

    .line 783
    iget-object v3, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition;

    invoke-virtual {v3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer()Landroidx/transition/Transition;

    move-result-object v3

    invoke-direct {v0, v3}, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer(Landroidx/transition/Transition;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_28
    return-object v0
.end method

.method public final synthetic RemoteActionCompatParcelizer(J)Landroidx/transition/Transition;
    .registers 3

    .line 65
    invoke-virtual {p0, p1, p2}, Landroidx/transition/TransitionSet;->IconCompatParcelizer(J)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic RemoteActionCompatParcelizer(Landroid/view/View;)Landroidx/transition/Transition;
    .registers 2

    .line 65
    invoke-direct {p0, p1}, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;
    .registers 2

    .line 65
    invoke-direct {p0, p1}, Landroidx/transition/TransitionSet;->write(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(I)Landroidx/transition/TransitionSet;
    .registers 3

    const/4 v0, 0x1

    if-eqz p1, :cond_19

    if-ne p1, v0, :cond_9

    const/4 p1, 0x0

    .line 138
    iput-boolean p1, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    return-object p0

    .line 144
    :cond_9
    new-instance p0, Landroid/util/AndroidRuntimeException;

    const-string v0, "Invalid parameter for TransitionSet ordering: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 141
    :cond_19
    iput-boolean v0, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 4

    .line 640
    iget-object v0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/TransitionSet;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 641
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    .line 642
    iget-object v1, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 643
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 644
    iget-object v1, p1, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_2b
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 65
    invoke-virtual {p0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer()Landroidx/transition/Transition;

    move-result-object p0

    return-object p0
.end method

.method final handleMediaPlayPauseIfPendingOnHandler()Z
    .registers 4

    const/4 v0, 0x0

    move v1, v0

    .line 501
    :goto_2
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1d

    .line 502
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 503
    invoke-virtual {v2}, Landroidx/transition/Transition;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result v2

    if-eqz v2, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1d
    return v0
.end method

.method protected final onMediaButtonEvent()V
    .registers 5

    .line 468
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 469
    invoke-virtual {p0}, Landroidx/transition/TransitionSet;->onPlay()V

    .line 470
    invoke-virtual {p0}, Landroidx/transition/TransitionSet;->MediaBrowserCompatItemReceiver()V

    return-void

    .line 473
    :cond_f
    invoke-direct {p0}, Landroidx/transition/TransitionSet;->onFastForward()V

    .line 474
    iget-boolean v0, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    if-nez v0, :cond_4b

    const/4 v0, 0x1

    .line 477
    :goto_17
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_3c

    .line 478
    iget-object v1, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/transition/Transition;

    .line 479
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 480
    new-instance v3, Landroidx/transition/TransitionSet$1;

    invoke-direct {v3, p0, v2}, Landroidx/transition/TransitionSet$1;-><init>(Landroidx/transition/TransitionSet;Landroidx/transition/Transition;)V

    invoke-virtual {v1, v3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    add-int/lit8 v0, v0, 0x1

    goto :goto_17

    .line 488
    :cond_3c
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/transition/Transition;

    if-eqz p0, :cond_61

    .line 490
    invoke-virtual {p0}, Landroidx/transition/Transition;->onMediaButtonEvent()V

    return-void

    .line 493
    :cond_4b
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_51
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_61

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    .line 494
    invoke-virtual {v0}, Landroidx/transition/Transition;->onMediaButtonEvent()V

    goto :goto_51

    :cond_61
    return-void
.end method

.method final onPause()V
    .registers 8

    const-wide/16 v0, 0x0

    .line 513
    iput-wide v0, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    .line 514
    new-instance v0, Landroidx/transition/TransitionSet$3;

    invoke-direct {v0, p0}, Landroidx/transition/TransitionSet$3;-><init>(Landroidx/transition/TransitionSet;)V

    const/4 v1, 0x0

    .line 525
    :goto_a
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_3d

    .line 526
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    .line 527
    invoke-virtual {v2, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    .line 528
    invoke-virtual {v2}, Landroidx/transition/Transition;->onPause()V

    .line 529
    invoke-virtual {v2}, Landroidx/transition/Transition;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()J

    move-result-wide v3

    .line 530
    iget-boolean v5, p0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    if-eqz v5, :cond_31

    .line 531
    iget-wide v5, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    goto :goto_3a

    .line 533
    :cond_31
    iget-wide v5, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    iput-wide v5, v2, Landroidx/transition/Transition;->AudioAttributesImplApi26Parcelizer:J

    .line 534
    iget-wide v5, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Landroidx/transition/Transition;->AudioAttributesImplBaseParcelizer:J

    :goto_3a
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_3d
    return-void
.end method

.method public final onPlayFromMediaId()I
    .registers 1

    .line 211
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p0

    return p0
.end method

.method public final synthetic read(J)Landroidx/transition/Transition;
    .registers 3

    .line 65
    invoke-direct {p0, p1, p2}, Landroidx/transition/TransitionSet;->AudioAttributesCompatParcelizer(J)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method public final read(Landroidx/transition/Transition$AudioAttributesCompatParcelizer;)V
    .registers 5

    .line 760
    invoke-super {p0, p1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesCompatParcelizer;)V

    .line 761
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    .line 762
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_20

    .line 764
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->read(Landroidx/transition/Transition$AudioAttributesCompatParcelizer;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_20
    return-void
.end method

.method public final read(Lo/Rcolor;)V
    .registers 5

    .line 750
    invoke-super {p0, p1}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    .line 751
    iget v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/transition/TransitionSet;->RatingCompat:I

    .line 752
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_20

    .line 754
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_20
    return-void
.end method

.method public final read(Lo/Rstring;)V
    .registers 4

    .line 628
    iget-object v0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/transition/TransitionSet;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 629
    iget-object p0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    .line 630
    iget-object v1, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/transition/Transition;->read(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 631
    invoke-virtual {v0, p1}, Landroidx/transition/Transition;->read(Lo/Rstring;)V

    .line 632
    iget-object v1, p1, Lo/Rstring;->IconCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_2b
    return-void
.end method

.method public final read()Z
    .registers 5

    .line 617
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_1c

    .line 619
    iget-object v3, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition;

    invoke-virtual {v3}, Landroidx/transition/Transition;->read()Z

    move-result v3

    if-nez v3, :cond_19

    return v1

    :cond_19
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_1c
    const/4 p0, 0x1

    return p0
.end method

.method public final synthetic write(Landroid/animation/TimeInterpolator;)Landroidx/transition/Transition;
    .registers 2

    .line 65
    invoke-virtual {p0, p1}, Landroidx/transition/TransitionSet;->AudioAttributesCompatParcelizer(Landroid/animation/TimeInterpolator;)Landroidx/transition/TransitionSet;

    move-result-object p0

    return-object p0
.end method

.method final write(Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    .line 770
    invoke-super {p0, p1}, Landroidx/transition/Transition;->write(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 771
    :goto_5
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_41

    .line 772
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/transition/Transition;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/transition/Transition;->write(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_41
    return-object v0
.end method

.method final write(JJ)V
    .registers 23

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    .line 557
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/TransitionSet;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()J

    move-result-wide v5

    .line 558
    iget-object v7, v0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_20

    cmp-long v7, v1, v8

    if-gez v7, :cond_18

    cmp-long v7, v3, v8

    if-ltz v7, :cond_c0

    :cond_18
    cmp-long v7, v1, v5

    if-lez v7, :cond_20

    cmp-long v7, v3, v5

    if-gtz v7, :cond_c0

    :cond_20
    cmp-long v7, v1, v3

    const/4 v10, 0x0

    if-gez v7, :cond_27

    const/4 v12, 0x1

    goto :goto_28

    :cond_27
    move v12, v10

    :goto_28
    cmp-long v13, v1, v8

    if-ltz v13, :cond_30

    cmp-long v14, v3, v8

    if-ltz v14, :cond_38

    :cond_30
    cmp-long v14, v1, v5

    if-gtz v14, :cond_3f

    cmp-long v14, v3, v5

    if-lez v14, :cond_3f

    .line 567
    :cond_38
    iput-boolean v10, v0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 568
    sget-object v14, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->write:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {v0, v14, v12}, Landroidx/transition/TransitionSet;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 570
    :cond_3f
    iget-boolean v14, v0, Landroidx/transition/TransitionSet;->MediaMetadataCompat:Z

    if-eqz v14, :cond_5c

    .line 571
    :goto_43
    iget-object v7, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v7

    if-ge v10, v7, :cond_59

    .line 572
    iget-object v7, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/transition/Transition;

    .line 573
    invoke-virtual {v7, v1, v2, v3, v4}, Landroidx/transition/Transition;->write(JJ)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_43

    :cond_59
    move/from16 v16, v12

    goto :goto_a2

    .line 577
    :cond_5c
    invoke-direct {v0, v3, v4}, Landroidx/transition/TransitionSet;->write(J)I

    move-result v10

    if-ltz v7, :cond_86

    .line 581
    :goto_62
    iget-object v7, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v7

    if-ge v10, v7, :cond_59

    .line 582
    iget-object v7, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/transition/Transition;

    .line 583
    iget-wide v14, v7, Landroidx/transition/Transition;->AudioAttributesImplApi26Parcelizer:J

    move/from16 v16, v12

    sub-long v11, v1, v14

    cmp-long v17, v11, v8

    if-ltz v17, :cond_a2

    sub-long v14, v3, v14

    .line 589
    invoke-virtual {v7, v11, v12, v14, v15}, Landroidx/transition/Transition;->write(JJ)V

    add-int/lit8 v10, v10, 0x1

    move/from16 v12, v16

    goto :goto_62

    :cond_86
    move/from16 v16, v12

    :goto_88
    if-ltz v10, :cond_a2

    .line 594
    iget-object v7, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/transition/Transition;

    .line 595
    iget-wide v11, v7, Landroidx/transition/Transition;->AudioAttributesImplApi26Parcelizer:J

    sub-long v14, v1, v11

    sub-long v11, v3, v11

    .line 598
    invoke-virtual {v7, v14, v15, v11, v12}, Landroidx/transition/Transition;->write(JJ)V

    cmp-long v7, v14, v8

    if-gez v7, :cond_a2

    add-int/lit8 v10, v10, -0x1

    goto :goto_88

    .line 605
    :cond_a2
    :goto_a2
    iget-object v7, v0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    if-eqz v7, :cond_c0

    cmp-long v1, v1, v5

    if-lez v1, :cond_ae

    cmp-long v2, v3, v5

    if-lez v2, :cond_b4

    :cond_ae
    if-gez v13, :cond_c0

    cmp-long v2, v3, v8

    if-ltz v2, :cond_c0

    :cond_b4
    if-lez v1, :cond_b9

    const/4 v1, 0x1

    .line 609
    iput-boolean v1, v0, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 611
    :cond_b9
    sget-object v1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    move/from16 v11, v16

    invoke-virtual {v0, v1, v11}, Landroidx/transition/TransitionSet;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    :cond_c0
    return-void
.end method

.method final write(Lo/Rstring;)V
    .registers 5

    .line 652
    invoke-super {p0, p1}, Landroidx/transition/Transition;->write(Lo/Rstring;)V

    .line 653
    iget-object v0, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_1a

    .line 655
    iget-object v2, p0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p1}, Landroidx/transition/Transition;->write(Lo/Rstring;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

###### Class androidx.transition.TransitionSet.AnonymousClass1 (androidx.transition.TransitionSet$1)
.class final Landroidx/transition/TransitionSet$1;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/TransitionSet;->onMediaButtonEvent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/transition/TransitionSet;

.field final synthetic read:Landroidx/transition/Transition;


# direct methods
.method constructor <init>(Landroidx/transition/TransitionSet;Landroidx/transition/Transition;)V
    .registers 3

    .line 480
    iput-object p1, p0, Landroidx/transition/TransitionSet$1;->IconCompatParcelizer:Landroidx/transition/TransitionSet;

    iput-object p2, p0, Landroidx/transition/TransitionSet$1;->read:Landroidx/transition/Transition;

    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroidx/transition/Transition;)V
    .registers 3

    .line 483
    iget-object v0, p0, Landroidx/transition/TransitionSet$1;->read:Landroidx/transition/Transition;

    invoke-virtual {v0}, Landroidx/transition/Transition;->onMediaButtonEvent()V

    .line 484
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-void
.end method

###### Class androidx.transition.TransitionSet.AnonymousClass3 (androidx.transition.TransitionSet$3)
.class final Landroidx/transition/TransitionSet$3;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/TransitionSet;->onPause()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/transition/TransitionSet;


# direct methods
.method constructor <init>(Landroidx/transition/TransitionSet;)V
    .registers 2

    .line 514
    iput-object p1, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 4

    .line 517
    iget-object v0, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    iget-object v0, v0, Landroidx/transition/TransitionSet;->MediaBrowserCompatMediaItem:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 518
    iget-object p1, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    invoke-virtual {p1}, Landroidx/transition/TransitionSet;->handleMediaPlayPauseIfPendingOnHandler()Z

    move-result p1

    if-nez p1, :cond_23

    .line 519
    iget-object p1, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    sget-object v0, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/transition/TransitionSet;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    .line 520
    iget-object p1, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/transition/Transition;->MediaBrowserCompatItemReceiver:Z

    .line 521
    iget-object p0, p0, Landroidx/transition/TransitionSet$3;->write:Landroidx/transition/TransitionSet;

    sget-object p1, Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;->read:Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;

    invoke-virtual {p0, p1, v1}, Landroidx/transition/TransitionSet;->read(Landroidx/transition/Transition$AudioAttributesImplBaseParcelizer;Z)V

    :cond_23
    return-void
.end method

###### Class androidx.transition.TransitionSet.read (androidx.transition.TransitionSet$read)
.class final Landroidx/transition/TransitionSet$read;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/TransitionSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# instance fields
.field private write:Landroidx/transition/TransitionSet;


# direct methods
.method constructor <init>(Landroidx/transition/TransitionSet;)V
    .registers 2

    .line 414
    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    .line 415
    iput-object p1, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    .line 420
    iget-object p1, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    iget-boolean p1, p1, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer:Z

    if-nez p1, :cond_10

    .line 421
    iget-object p1, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    invoke-virtual {p1}, Landroidx/transition/TransitionSet;->onPlay()V

    .line 422
    iget-object p0, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer:Z

    :cond_10
    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 4

    .line 428
    iget-object v0, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    iget v1, v0, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer:I

    .line 429
    iget-object v0, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    iget v0, v0, Landroidx/transition/TransitionSet;->RemoteActionCompatParcelizer:I

    if-nez v0, :cond_18

    .line 431
    iget-object v0, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/TransitionSet;->AudioAttributesImplApi21Parcelizer:Z

    .line 432
    iget-object v0, p0, Landroidx/transition/TransitionSet$read;->write:Landroidx/transition/TransitionSet;

    invoke-virtual {v0}, Landroidx/transition/TransitionSet;->MediaBrowserCompatItemReceiver()V

    .line 434
    :cond_18
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-void
.end method
