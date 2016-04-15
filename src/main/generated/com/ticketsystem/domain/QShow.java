package com.ticketsystem.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QShow is a Querydsl query type for Show
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QShow extends EntityPathBase<Show> {

    private static final long serialVersionUID = -1956380511L;

    public static final QShow show = new QShow("show");

    public final StringPath contents = createString("contents");

    public final StringPath endDate = createString("endDate");

    public final DateTimePath<java.util.Date> regDate = createDateTime("regDate", java.util.Date.class);

    public final StringPath regId = createString("regId");

    public final StringPath runningTime = createString("runningTime");

    public final StringPath showCd = createString("showCd");

    public final ListPath<ShowDet, QShowDet> showDets = this.<ShowDet, QShowDet>createList("showDets", ShowDet.class, QShowDet.class, PathInits.DIRECT2);

    public final NumberPath<Long> showSeq = createNumber("showSeq", Long.class);

    public final StringPath startDate = createString("startDate");

    public final StringPath title = createString("title");

    public final DateTimePath<java.util.Date> updateDate = createDateTime("updateDate", java.util.Date.class);

    public final StringPath updateId = createString("updateId");

    public QShow(String variable) {
        super(Show.class, forVariable(variable));
    }

    public QShow(Path<? extends Show> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShow(PathMetadata<?> metadata) {
        super(Show.class, metadata);
    }

}

